package Collection.Collection401_410;

import Collection.pets.Pet;
import Collection.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * 这是刚才那种iterator的升级版本,调用iterator可以单向运动,但是这种listIteration却可以多向运动
 * Created by 22643 on 2020/4/17.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pet= Pets.arrayList(8);
        ListIterator<Pet> it=pet.listIterator();//跟Iterator的调用方式一扬
        while(it.hasNext()){
            Pet pet1=it.next();
            System.out.println(pet1+""+it.nextIndex());//正向(可以产生索引)
        }
        while(it.hasPrevious()){
            System.out.println(it.previous().id());//从后往前(可以产生索引)
        }
        System.out.println();
        System.out.println(pet);
        it=pet.listIterator(3);//产生一个列表索引指向List的n 处的ListIterator.
          while(it.hasNext()){
              it.next();
              it.set(Pets.randomPet());
          }
        System.out.println(pet);
    }



}
