package Collection.Collection390_400;

import org.omg.CORBA.ARG_IN;

import java.util.*;

/**
 * 396
 * Created by 22643 on 2020/4/14.
 */
public class AddingGroup {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));//asList方法接收一个数组或者用逗号分割的元素列表,将其转化为List对象
        Integer[] moreInts={ 6,7,8,9,10 };
        c.addAll(Arrays.asList(moreInts));//Colleciton.addAll只接受一个Collection(所以要asList)对象,以及一个数组或者用逗号分割的列表,将元素添加到Colleciton中.
        Collections.addAll(c,11,12,13,14,15);//Collections.addAll是首选的方法,这种方式很方便.但是你不能用它来顶一个一个新的Collection对象
        List<Integer> list= Arrays.asList(16,17,18,19);
        list.add(21);//虽然现在可以,但是在运行阶段会出现错误,因为他的底层是数组,因此不能调整尺寸
    }
}
