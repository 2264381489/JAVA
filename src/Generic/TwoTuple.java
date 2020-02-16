package Generic;

/**
 * 621
 * 元组
 * 何为元组，仅一次调用就返回多个对象，return只能返回一个，解决办法就是创建一个对象，用它来持有想要返回的多个元素，
 *
 */
public class TwoTuple<A,B> {
public final A first;
public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Generic.TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<Integer,String> twoTuple=new TwoTuple<>(1,"YAN");
        //你会发现下面的句子很有问题，这也是java编程思想中十分重要的一种思想，客户端编程。在psvm部分不能修改 class Generic.TwoTuple<A,B>中的内容。
        //final是常量，无法被赋值。这个方法实际上要比将他们设置为private类型更加轻松。
        //如果使用了private类型，往往意味着要使用get和set方法。明显这个轻松一些。
//        twoTuple.first=2;
        //
        twoTuple.toString();
        System.out.println(twoTuple.toString());
    }
}
