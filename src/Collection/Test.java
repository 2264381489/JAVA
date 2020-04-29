package Collection;

import java.util.*;

public class Test {
int a=0;

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                '}';

    }
    public static void  display(Collection<?> a){
        int b=0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();//链表
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        display(list);//[1, 2, 4, 3]
        Set<Integer> set=new TreeSet<>();//树集
        set.addAll(list);
        //在这里之所以两者输出不同,是因为树集有着一个自动排序的功能.其原因在于对于treeset内部结构的实现和LinkedList有所不同
        display(set);//[1, 2, 3, 4]


    }
}
