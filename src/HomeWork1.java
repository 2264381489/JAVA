import java.util.LinkedList;

public class HomeWork1    {
}
class Solution {
    public int maxProduct(int[] nums) {
        //双指针清除数组中负数
        int pre=-1;
        int last=-1;
        //按照0为划分，清除数组中的负数
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                //如果遇见0，则对划分中的双指针清空，因为如果为0.无论前面字符串到此为止是什么，均为0
                pre=-1;
                last=-1;
            }
            if(pre==-1&&nums[i]<0){
                pre=i;
                continue;
            }
            if(pre!=-1&&nums[i]<0){
                nums[i]*=-1;
                nums[pre]*=-1;
                pre=-1;
            }
        }
        int count=1;//总值
        int max=nums[0];
        for(int j=0;j<nums.length;j++){
            //如果遇见0,count清空
            if(nums[j]==0){
                count=1;
                max=Math.max(0,max);
                continue;
            }else{
                count*=nums[j];
            }
            max=Math.max(count,max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxProduct(new int[]{-4,-3,-2});
    }
}
class Solution1 {
    public static int longestWPI(int[] hours) {
//建立一个栈
        LinkedList<Integer> Stack=new LinkedList<>();
        int i=0;
        while(hours[i]<8){
            i++;
        }
        //  Stack.addFirst(-1);
        //维护一个数组,保存各个位置上的字符串
        //将数组中数据加入其中
        int size=0;//长度
        int max=0;//最大的长度
        for(;i<hours.length;i++){
            //大于8入栈,小于等于8出栈
            if(hours[i]>8){
                Stack.addFirst(hours[i]);
                size++;
            }else{
                //如果栈为空  如果同长度 下一个是>8的数则可以继续,如果下一个是小于8的数,则清空数组
                if(Stack.isEmpty()){
                    max=Math.max(max,size);
                    size=0;
                    continue;
                }
                Stack.removeFirst();
                size++;
            }
        }
        //  Stack.addLast(hours[])
        return size-1;
    }

    public static void main(String[] args) {
        Solution1.longestWPI(new int[]{9,9,6,0,6,6,9});
    }
}