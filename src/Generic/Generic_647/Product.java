package Generic.Generic_647;

import Generic.Generic_627_628_629_630.Generator;
import Generic.Generic_635_636_637_638.Generators;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * 648
 * 想你展示一下泛型的超级好处，就是无论你把程序写的多么复杂，也可以很安全的管理。因为所有内容都是被限定的。
 */
//产品对象，
public class Product {
    private final int id;//id号
    private String decription;//描述
    private double price;//价格
//产品构造方法。用来构造Product。这是使用构造器必须的方式。
    public Product(int id, String decription, double price) {
        this.id = id;
        this.decription = decription;
        this.price = price;
    }
//输出方法
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", decription='" + decription + '\'' +
                ", price=" + price +
                '}';
    }
    //更改价格方法
    public void priceChange(double change){
        price+=change;
    }
    //生成器，只要调用这个生成器方法就能自动生成一个构造函数。
    public static Generator<Product> generator=
            new Generator<Product>() {
        Random rand=new Random();
                @Override
                public Product next() throws IllegalAccessException, InstantiationException {
                    return new Product(rand.nextInt(1000),"test",Math.round(rand.nextDouble()*1000)+0.99);
                }
            };
}
//生成想要数量的对象，这个就是数组对象。用泛型规定了它的要求。
class shelf extends ArrayList<Product>{
    public shelf(int nProducts) throws IllegalAccessException, InstantiationException {
        //空容器，要生成的对象，生成数量
        Generators.filld(this,Product.generator,nProducts);

    }
}
//又是一层容器，会产生nShelves * nProducts数量个元素
class Aisle extends ArrayList<shelf>{
    public Aisle(int nShelves,int nProducts) throws InstantiationException, IllegalAccessException {
        for (int i=0;i<nShelves;i++){
            add(new shelf(nProducts));
        }
    }
}
class CheckoutStand{}
class Office{}
//测试元素。
class Store extends ArrayList<Aisle>{
    //在这个里面没有用上
private ArrayList<CheckoutStand> checkouts=new ArrayList<>();
//没什么用的一个元素
private Office office=new Office();
    //第三层容器形成总数  nAisles * nShelves * nProducts数量个元素
public Store(int nAisles, int nShelves, int nProducts) throws IllegalAccessException, InstantiationException {
    for (int i = 0; i < nAisles; i++) {
        add(new Aisle(nShelves, nProducts));
    }
}
//当要打印他的时候，使用这个形成一个内容。
    @Override
    public String toString() {
    //库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象.
        //总结一下就是可以不断从尾部添加的String对象
        StringBuilder result=new StringBuilder();
        for(Aisle a:this){
            for (shelf s:a){
                for (Product p:s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println(new Store(14,5,10));
    }
}

