package Collection.Collection401_410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 401,402,403
 * Created by 22643 on 2020/4/16.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand=new Random(47);//相同的种子会产生相同的随机序列。
        List<String> list=new ArrayList<>();
        list.add("demo3");
        list.add("demo2");
        list.add("demo1");//加入方法
        System.out.println("插入元素前list集合"+list);//可以直接输出
        /**
         * /void add(int index, E element)在指定位置插入元素，后面的元素都往后移一个元素
         */
        list.add(2,"demo5");
        System.out.println("插入元素前list集合"+list);
        List<String> listtotal=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list1.add("newdemo1");
        list1.add("newdemo2");
        list1.add("newdemo2");
        /**
         * boolean addAll(int index, Collection<? extends E> c)
         * 在指定的位置中插入c集合全部的元素，如果集合发生改变，则返回true，否则返回false。
         * 意思就是当插入的集合c没有元素，那么就返回false，如果集合c有元素，插入成功，那么就返回true。
         */
        boolean b=listtotal.addAll(list1);
        boolean c=listtotal.addAll(2,list2);
        System.out.println(b);
        System.out.println(c);//插入2号位置,list2是空的
        System.out.println(list1);
        /**
         * E get(int index)
         * 返回list集合中指定索引位置的元素
         */
        System.out.println(list1.get(1));//list的下标是从0开始的
        /**
         * int indexOf(Object o)
         * 返回list集合中第一次出现o对象的索引位置，如果list集合中没有o对象，那么就返回-1
         */
        System.out.println(list1.indexOf("demo"));
        System.out.println(list1.indexOf("newdemo2"));
//如果在list中有相同的数,也没有问题.
        //但是如果是对象,因为每个对象都是独一无二的.所以说如果传入一个新的对象,indexof和remove都是无法完成任务的
        //要是删除,可以先找到其位置,然后在进行删除.
        //Pet p=pets.get(2);
        //pets.remove(p);
        /**
         * 查看contains查看参数是否在list中
         */
        System.out.println(list1.contains("newdemo2"));//true
        /**
         * remove移除一个对象
         * 返回true和false
         */
        //只删除其中的一个
        System.out.println(list1.remove("newdemo2"));//[newdemo1, newdemo2]
        System.out.println(list1);
        List<String> pets=list1.subList(0,1);//让你从较大的一个list中创建一个片段
        //containall一个list在不在另一个list中
        System.out.println(pets+"在list中嘛"+list1.containsAll(pets));//[newdemo1]在list中嘛true
        //因为sublist的背后就是初始化列表,所以对于sublist的修改会直接反映到原数组上面
        pets.add("new add demo");
        System.out.println(list1);//[newdemo1, new add demo, newdemo2]
        Collections.sort(pets);
        System.out.println(
                pets
        );//new add demo, newdemo1
        System.out.println(list1.containsAll(pets));//true-----变换位置不会影响是否在list1中被找到.
        list1.removeAll(pets);//移除在参数list中的全部数据
        /**
         * list1[newdemo1, new add demo, newdemo2]
         * pets[new add demo, newdemo1]
         */
        System.out.println(list1);//[newdemo2]
        System.out.println(list1.isEmpty());//是否为空
        System.out.println(list1.toArray());//将list变为数组
        //list的addAll方法有一个重载的.可以让他在中间加入

    }
}
