package Collection.Collection390_400;

import java.util.ArrayList;

/**
 * 390-391
 * Created by 22643 on 2020/4/14.
 */
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}//每生成一个新的Apple类，id都会加1.但是每个APPLE类又会抱有自己的那一个java类

class Orange {
}

public class AppleAndOrangeWithOutGenerics {
    @SuppressWarnings("unchecked")//这个只能抑制警告信息,用它就不会有警告

    public static void main(String args[]) {
        /**
         * 不用泛型
         */
//        ArrayList apples=new ArrayList();
//        for (int i = 0; i <3 ; i++) {
//            apples.add(new Apple());//在ArrayList无论放进去之前是什么,再放进去之后都会变成Object类型,
//            apples.add(new Orange());//会报一个小小的warning,因为没有使用泛型.<-只有删掉这个句子执行才不报错
//        }
//            for (int j = 0; j <apples.size() ; j++) {
//                System.out.println(((Apple)apples.get(j)).id());//如果没有泛型的拦截,输入Orange类型根本不会被发现.非常的危险
//            }
//
        /**
         * 使用泛型
         */
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
//            apples.add(new Orange());//在这里直接就报错了,让这种错误在编译期就被发现

        }
        for (int j = 0; j < apples.size(); j++) {
            //用了反省之后连强制转换都不需要了
            System.out.println(( apples.get(j)).id());//如果没有泛型的拦截,输入Orange类型根本不会被发现.非常的危险
            //
        }

    }
}


