package Generic_649;


import java.util.*;

/**
 * 650,651,652
 * 运行之后你会发现你想要写的泛型并不存在。
 * 全是泛型声明时候的样子。exp：[K, V]
 * 在泛型代码内部，无法获得任何有关泛型的参数类型的信息。
 * java泛型是使用擦除来实现，这意味着当你在使用泛型时候，任何具体的类型信息都被擦除了，你唯一知道的就是你在使用的一个对象，因此List<String>helist<Double></>
 *在运行时实际上是相同的类型。
 *
 */
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list=new ArrayList<>();
        Map<Frob,Fnorkle> map=new HashMap<>();
        Quark<Fnorkle> quark=new Quark<>();
        Particle<Long,Double> p=new Particle<>();
        //.getTypeParameters()返回Class对象的类型数组,
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));//list
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));//map
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));//quark
    }



}