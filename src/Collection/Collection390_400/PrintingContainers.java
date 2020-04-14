package Collection.Collection390_400;

/**
 * 398
 * Created by 22643 on 2020/4/14.
 */

import java.util.*;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;

/**
 * 容器的打印
 */
public class PrintingContainers {
    /**
     *
     * @param collection 输入一个Colleciton,给这个输入的collection添加元素
     * @return 返回添加了元素的collection
     */
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }//输入一个Colleciton,给这个输入的collection添加元素

    /**
     *
     * @param map 将添加完元素的map返回去
     * @return
     */
    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));

    }
}
