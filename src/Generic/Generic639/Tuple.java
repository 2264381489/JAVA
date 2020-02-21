package Generic.Generic639;

import Generic.ThreeTuple;
import Generic.TwoTuple;

public class Tuple {
public static <A,B>  TwoTuple<A,B> tuple(A a,B b){
    return new TwoTuple<>(a,b);
}
public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b,C c){
    return  new ThreeTuple<>(a,b,c);
}
//four和five没有写
}
