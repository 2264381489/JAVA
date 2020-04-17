package Collection.Collection401_410;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 22643 on 2020/4/17.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        //1.通过索引遍历list
        for (int i = 0; i <list.size(); i++) {
            System.out.println("1:"+list.get(i));
//            System.out.print("2"+list.get(i));

        }
        //2.迭代器遍历
       Iterator<String> listInterator=list.iterator();
        while(listInterator.hasNext()){
            System.out.println(listInterator.next());
        }//遍历方法1
        for (String s:list){ //注意这里要用list原本的对象而不是迭代器对象
            System.out.println(s);
        }//遍历方法2
        for (int i = 0; i <list.size() ; i++) {
            listInterator.next();
            listInterator.remove();//删除由next产生的最后一个元素,这意味着在调用remove之前必须先调用next
        }

        }
}
