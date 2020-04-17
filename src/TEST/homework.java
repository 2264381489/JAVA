package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 22643 on 2020/4/16.
 */
public class homework {
    int[] arr=new int[]{1,2,3,4,5};
    int[] arr2=new int[5];

    /**
     *
     * @param src 原数组
     * @param srcPos 原数组拷贝起始位置
     * @param desc 新数组
     * @param destPos 新数组起始位置
     * @param length 拷贝长度
     */
    public static void arrycopy(int[] src,int srcPos,int[] desc,int destPos,int length){
        List<Integer> list=new ArrayList<>();
        List<Integer> resultList=new ArrayList<>();
        for (int a:desc
             ) {
            resultList.add(a);
        }
        for (int i = 0; i <length ; i++) {
             list.add(src[srcPos+i]);
        }
        resultList.addAll(destPos,list);
        System.out.println(resultList.toString());
    }
    public static void main(String[] args) {
        arrycopy(new int[]{1,2,3,4,5,6},1,new int[]{1,2,3,4},2,1);
    }
}
