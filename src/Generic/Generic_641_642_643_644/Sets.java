package Generic.Generic_641_642_643_644;

import java.util.HashSet;
import java.util.Set;

/**
 * 641
 * union方法，返回一个Set，将他们两个参数合并在一起
 * intersection方法，返回两个参数共有的部分
 * difference方法，a参数中独有于b的部分。
 * complent方法，a，b参数中非公有的部分（交集之外的所有元素）。
 */
public class Sets {
     public static <T> Set<T> union(Set<T> a,Set<T> b){
         Set<T>  result=new HashSet<T>(a);
         //将一个容器（容器中的全部东西加入到这个容器中）
         result.addAll(b);
         return result;
     }
     //retainAll方法用于从collection中移除未包含在指定collection1中的所有元素。
     public static <T> Set<T> intersection(Set<T> a,Set<T> b){
         Set<T> result=new HashSet<T>();
         result.retainAll(b);
         return result;
     }
     //移除全部元素
    public static <T> Set<T> difference(Set<T> a,Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.removeAll(b);
        return result;

    }
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
         return difference(union(a,b),intersection(a,b));

    }

 }
