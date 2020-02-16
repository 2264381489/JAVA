package Generic;

/**
 * 622
 * 你会发现要想创造一个返回三个数组的家伙十分的简单。
 * 只要利用继承机制就能做到。
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class ThreeTuple<A,B,C> extends TwoTuple {
    public final C third;
    public ThreeTuple(A first, B second,C third) {
        super(first, second);//这个要写在最上面？？？？？
        this.third=third;
    }

    @Override
    public String toString() {
        return "Generic.ThreeTuple{" +
                "third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
