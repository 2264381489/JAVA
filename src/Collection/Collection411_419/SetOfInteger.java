package Collection.Collection411_419;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *415
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Set<Integer> intset=new HashSet<>();//创建一个HashSet
        for (int i = 0; i <100 ; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);//set特性只能输入相同的数,别看输入了100个数,但是实际上只有30个进去了.
    }
}
