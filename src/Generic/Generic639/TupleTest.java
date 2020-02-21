package Generic.Generic639;

import Generic.ThreeTuple;
import Generic.TwoTuple;
/**
 * 639号代码。泛型化就是参数化，方法头加上了泛型，就叫做参数化。return中的返回类型会被方法头上的返回类型，向上转型。也正是如此，f2（）没有跳出警告
 */
import static Generic.Generic639.Tuple.tuple;

public class TupleTest {
//    Tuple tuple=new Tuple();
    static TwoTuple<String,Integer> f(){
        return tuple("H1",47);
    }
    //这好像是就是参数推断的意思。参数推断是在方法中才奏效的。就像这个。
    static TwoTuple f2(){
        return tuple("H1",47);
    }
    static ThreeTuple F3(){
        return tuple("h1","h1",2);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(f());
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(F3());
    }
}
