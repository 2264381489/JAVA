package Generic.Generic_641_642_643_644;

import java.util.EnumSet;
import java.util.Set;

import static Generic.Generic_641_642_643_644.Sets.*;

public class WatercolorSets {
    public static void main(String[] args) {
        //你可以发现，有了泛型的好处就是可以不用声明就直接使用Watercolors。
        Sets watercolors = new Sets();
        Set<Watercolors> set= EnumSet.range(Watercolors.BRILLIANT_RED,Watercolors.VIRIDIA_HUE);
    ///**
        // * 641
        // * union方法，返回一个Set，将他们两个参数合并在一起
        // * intersection方法，返回两个参数共有的部分
        // * difference方法，a参数中独有于b的部分。
        // * complent方法，a，b参数中非公有的部分（交集之外的所有元素）。
        // */
        Set<Watercolors> set2= EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,Watercolors.BURNT_UMBER);
        System.out.println("set"+set);
        System.out.println("set"+set2);
        System.out.println("set-union"+watercolors.union(set,set2));
        System.out.println("set-intersection"+intersection(set,set2));
        System.out.println("set-different"+difference(set,intersection(set,set2)));
        System.out.println("set-complent"+complement(set,set2));
    }
}
