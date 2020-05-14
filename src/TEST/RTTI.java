//package TEST;
//
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.Collections;
//
//class Person{
//    private int i;
//
//    public int getI() {
//        return i;
//    }
//
//    public void setI(int i) {
//        this.i = i;
//    }
//
//    private Person(int i) {
//        this.i = i;
//    }
//
//    public Person() {
//
//    }
//}
//public class RTTI {
//    static {
//
//    }
//    public static void getFieldName(String path) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class z = Class.forName(path);//获取参数
//        Person o =(Person)z.newInstance();//实例化
//        //获取SET方法
//        Method setI = z.getMethod("setI", int.class);
//        setI.invoke(o,12);//传入参数
//
//        //获取GET方法
//        Method get=z.getMethod("getI",null);
//        //返回结果
//        System.out.println(get.invoke(
//                o,null));
//
//    }
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//
//
//
//        getFieldName("TEST.Person");
//
//
//
//
////        Class z = Class.forName("TEST.Person");
////        Class sz=Person.class;
////        Person person = new Person();
////        Class sz1=person.getClass();
////        Constructor constructor = z.getDeclaredConstructor(int.class);
////        constructor.setAccessible(true);//暴力反射
////        Method getI =  sz.getMethod("setI", int.class);
////        Object invoke = getI.invoke(person,12);//这么用的
////                    sz.getMethod("get")
////        System.out.println("得到的数据"+invoke);
////        Person o = (Person)constructor.newInstance(12);
////        System.out.println(o.getI());
//
//
//    }
//}
//
//class Solution {
//    public int[] sortedSquares(int[] A) {
//        //双指针解决问题,用双指针直接在结果数组中操作,省去最后的删除步骤.
//        int pre = 0;//遍历负数的指针
//        int last = A.length - 1;//遍历正数的指针.
//        int[] res = new int[A.length];//答案数组
//        int t = 0;//给结果数组用的
//        //标准的线性化方式
//        while (pre < last) {
//            if (A[last] * A[last] > A[pre] * A[pre]) {
//                res[t++] = A[last] * A[last];
//            } else {
//                res[t++] = A[pre] * A[pre];
//            }
//        }
//        return res;
//    }
//}
