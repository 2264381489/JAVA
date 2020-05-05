package Collection.Collection390_400;

import java.util.ArrayList;

/**392
 * Created by 22643 on 2020/4/14.
 */
class Grannysmith extends Apple{}
class gaga extends Apple{}
class didid extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<>();
        apples.add(new Grannysmith());
        apples.add(new gaga());//向上转型依然作用在泛型之中
        apples.add(new didid());//
        for (Apple c:apples
             ) {
            System.out.println(c);//程序输出的是从Obeject默认toString()方法产生的类名加散列码()hashcode产生
        }
    }
    /**
     * output
     * Collection.Collection390_400.Grannysmith@1b6d3586
     * Collection.Collection390_400.gaga@4554617c
     * Collection.Collection390_400.didid@74a14482
     */
}
