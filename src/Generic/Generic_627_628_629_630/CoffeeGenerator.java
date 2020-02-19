package Generic.Generic_627_628_629_630;

import java.util.Iterator;
import java.util.Random;


/**
 *628
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    //类名.class返回的是他们的类对象，里面包含着这个类的信息 讲解--》   https://blog.csdn.net/xingkongdeasi/article/details/79688505
    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    //创造一个模式的随机数对象。
    private static Random rand = new Random(47);
    private int size = 0;//传入要随机生成几个对象
    //构造函数（因为已经存在一个构造函数，所以要自己创建一个构造函数）
    public CoffeeGenerator() {}
    //构造函数
    public CoffeeGenerator(int size) { this.size = size;}
//生产types数组中的对象
    public Coffee next() throws IllegalAccessException, InstantiationException {

            return (Coffee)//强制转换，因为他们都是Coffee的子类，所以可以向上转型。要是不转型，满足不了return的条件。
                    types[rand.nextInt(types.length)].newInstance();

    }


//迭代器
    //在类的内部实现迭代器
    //默认实现的行为如下：//   for (T t : this) action.accept(t);
    class CoffeeIterator implements Iterator<Coffee>{
        int count=size;
        //判断是迭代器中是否有内容（哨兵？）
        public boolean hasNext(){return count>0;}
        //重写迭代器中next方法
        public Coffee next()  {
            //计数器减一
            count--;
            Coffee next = null;
            try {
                next = CoffeeGenerator.this.next();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            return next;
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }

    };
    //实现迭代器中的方法，已好在foreach中运用。
    //实现了iterable接口，可以再循环语句中运用
    //foreach可以自动调用这个方法，不比显示调用
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for(int i=0;i<5;i++){
            //这个是一个一个输出产生的随机变量
            System.out.println(coffeeGenerator.next());
            //这个是五个五个输出里面产生的随机变量
            for(Coffee c:new CoffeeGenerator(5)) System.out.println(c);
        }
    }
}
