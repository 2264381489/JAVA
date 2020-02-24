package Generic.Generic645;

import Generic.Generic_627_628_629_630.Generator;
import Generic.Generic_635_636_637_638.Generators;

import java.util.*;

/**
 * 645
 * 匿名内部类，泛型还可以应用于内部类，以及匿名内部类。
 * 引用的接口时自己写的。这个样子。
 * public interface Generator<T> {
 *     T next() throws IllegalAccessException, InstantiationException;
 * }
 *原文：
 * 由于Customer和Tellar类都只有private的构造器。
 *
 */
public class Customer {
    private  static long counter=1;//静态变量，只有一个，也就是说没新建一个Customer对象，这个就增加一（结合下一个句子。）
    private final long id=counter++;//计数的变量增加，赋值给常量。让常量发生变化。
    private Customer(){ }//生成器必须要有缺省的
    public String toString(){return "Customer"+id;}//toString方法，输出这个类的信息
    public static Generator<Customer> generator(){//
        return new Generator<Customer>() {
            @Override
            public Customer next() throws IllegalAccessException, InstantiationException {
                return new Customer();//接口中必须实现的方法
            }
            };//这里必须加入“;”因为这是内部匿名类。
        }
    }
    class Teller{
        private  static long counter=1;
        private final long id=counter++;
        public Teller() { }
        public String toString(){return "Teller"+id;}
      public static Generator<Teller> generator(){
            return new Generator<Teller>() {
                @Override
                public Teller next() throws IllegalAccessException, InstantiationException {
                    return new Teller();
                }
            };
      }
}
 class BamkTellar{
    public static void serve(Teller a,Customer b){
        System.out.println(a+"servies"+b);
    }

     public static void main(String[] args) throws IllegalAccessException, InstantiationException {
         Random rand=new Random(47);
         Queue<Customer> link=new LinkedList<Customer>();
         // Generator是生成器对象，
         Generators.filld(link,Customer.generator(),5);
         List<Teller> tellers=new ArrayList<>();
         Generators.filld(tellers,Teller.generator(),5);
         //之所以使用这个方法，在于foreach句子不可能同时输入两个不同的容器。
         //LIST和QUEUE都支持迭代器。
         for (Customer c:link){
             //rand用nextint方法的参数来控制出现的随机数的范围。
             serve(tellers.get(rand.nextInt(tellers.size())), c);
         }
     }
        }

