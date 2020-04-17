package Collection.Collection401_410;

import Collection.pets.Pet;
import Collection.pets.Pets;
import Collection.pets.Rat;

import java.util.*;

/**
 * LinkedLIST也像ArrayList一扬实现了基本的List接口,但是他执行一些操作效率更高,比如插入.
 * LIST为空就会抛出NoSuchElement-Exception
 * Created by 22643 on 2020/4/17.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));//后面括号中的意思是生成五个Pets对象
        System.out.println("pets = [" + pets + "]");
        System.out.println("pets.getFirst() "+pets.getFirst());//取第一个
        System.out.println("pets.element "+pets.element());//也是取第一个,跟first完全相同.
        //如果列表为空如上两个内容返回NoSuchElement-Exception
        System.out.println("pets.peek()"+pets.peek());//peek跟上面两个一扬,只是在列表为空的时候返回null
        System.out.println(pets.removeFirst());
        System.out.println(pets.remove());//这两个完全一样,都是移除并返回列表头,列表空的时候返回NoSuchElement-Exception
        System.out.println(pets.poll());//稍有差异,列表为空的时候返回null
        pets.addFirst(new Rat());//addFirst将一个元素插入头部,addLast是插到尾部
        System.out.println(pets);
        pets.add(new Rat());//将一个元素插入尾部
        System.out.println(pets);
        pets.offer(new Rat());//与上面一扬,将一个元素插入尾部
        System.out.println(pets);
        pets.set(2,new Rat());//将替换为指定的元素
        System.out.println(pets);
    }

}
