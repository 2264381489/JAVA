package Generic.Generic_635_636_637_638;

import java.util.ArrayList;
import java.util.List;

/**
 * 635
 * 泛型方法和可变参数列表能够很好的共存
 */
public class ExplicitTypeSpecification {
//arargs（variable arguments）机制，允许直接定义能和多个实参相匹配的形参。从而，可以用一种更简单的方式，来传递个数可变的实参。https://www.jianshu.com/p/b851af8e90c1
    //这个函数实现的是aslist方法。就是把输入的字符串变成数组
     public static <T>    List<T>    makeList(T... args){
         List<T> result=new ArrayList<T>();
         for(T item:args)
             result.add(item);
             return result;
     }

    public static void main(String[] args) {
        List<String> ls=makeList("a");
        System.out.println(ls);
        List<String> ls2=makeList("adcdefurhy".split(""));
        System.out.println(ls2);
    }
}
