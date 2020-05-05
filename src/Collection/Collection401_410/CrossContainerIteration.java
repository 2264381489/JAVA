package Collection.Collection401_410;

import Collection.pets.Pet;
import Collection.pets.Pets;

import java.util.*;

/**
 * Created by 22643 on 2020/4/17.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet pet=it.next();
            System.out.print(pet);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Pet> pets= Pets.arrayList(8);
        /**
         * ArrayList(Collection<? extends E> c)
         *           构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
         */
        LinkedList<Pet> pets1=new LinkedList<>(pets);
        HashSet<Pet> pets2=new HashSet<>(pets);
        TreeSet<Pet> pets3=new TreeSet<>(pets);
        display(pets1.iterator());//其实我们可以发现,咱们iterator有一个特殊的技巧,就是无论你是什么容器,都可以使用这个display.
        display(pets2.iterator());//书上原话:
        display(pets3.iterator());//能够将遍历序列的操作与序列底层的结构分离,实现了迭代器统一了对容器的访问方式.


    }
}
