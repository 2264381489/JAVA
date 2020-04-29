package Collection.Collection411_419;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 416
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random=new Random(47);
        SortedSet<Integer> intset=new TreeSet<>();
        for (int i = 0; i <100 ; i++) {
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);//set特性只能输入相同的数,别看输入了100个数,但是实际上只有30个进去了.
        //这个有序了.这就是treeset的功劳,因为内部的实现时红黑树,所以来说.这就简单了一些

    }
}
