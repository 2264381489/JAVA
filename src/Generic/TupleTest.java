package Generic;

/**
 * 623
 * 如果想使用元组只需定义一个长度合适的元组，将其作为方法的返回值然后再return中返回。
 *          这个和我刚才的想法有些出入。
 *          实际上元组是一种类似于数组的东西，是随用随建的。
 *
 */
public class TupleTest {
    static TwoTuple<Integer,String> f(){
        return new TwoTuple<Integer,String>(12,"hai");//返回你想使用的元组
    }
    static ThreeTuple<Integer,Integer,String> g(){
        return new ThreeTuple<>(1,12,"yan");
    }

    public static void main(String[] args) {
        TwoTuple<Integer,String> stti=f();//别多想，这个方法只是想要证明在 TwoTuple（这些元组）中的数字无法被使用。
        System.out.println(f());//static------?
    }
}
