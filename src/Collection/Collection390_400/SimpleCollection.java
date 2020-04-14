package Collection.Collection390_400;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 394
 * Created by 22643 on 2020/4/14.
 */
//我们为什么要用
class test {
    List<Apple> apples = new ArrayList<Apple>();//之所以我们要把ArrayList向上转型为List(接口),这是为了我们可以轻松的修改????

}

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);//add方法,将一个新的元素放进Collection中
        }
        for (Integer i : c
        ) {
            System.out.println(i);
        }
    }
}
