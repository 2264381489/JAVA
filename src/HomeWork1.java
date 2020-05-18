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