package Generic.Generic645;

import java.util.HashMap;
import java.util.Map;

//public class Customer {
//}
//    public int romanToInt(String s) {
//        // 算法一：判断后面数值是否大于前面
//        Map<Character, Integer> romaNumber = new HashMap<>();
//        romaNumber.put('I', 1);
//        romaNumber.put('V', 5);
//        romaNumber.put('X', 10);
//        romaNumber.put('L', 50);
//        romaNumber.put('C', 100);
//        romaNumber.put('D', 500);
//        romaNumber.put('M', 1000);
//
//        int firstValue = 0;
//        int nextValue = 0;
//        int sum = 0;
//
//        for (int i = 0; i < s.length(); i++){
//            firstValue = romaNumber.get(s.charAt(i));
//            if (i == s.length()-1){
//                sum += firstValue;
//            }else {
//                nextValue = romaNumber.get(s.charAt(i+1));
//                if (firstValue >= nextValue){
//                    sum += firstValue;
//                }else{
//                    sum -= firstValue;
//                }
//            }
//        }
//        return sum;
//    }
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hashmap=new HashMap();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        //应为在在左边的罗马数字要是小于右边的，就意味着这个是特殊情况。
        //罗马数字中小的数字在大的数字的右边（！）
        int firstvalue=0;
        int secondvalue=0;
        int total=0;
        for(int i=0;s.length()>i;i++){
            firstvalue=hashmap.get(s.charAt(i));
            if(i== s.length()-1){
                total+=hashmap.get(s.charAt(i));
            }else{
                secondvalue=hashmap.get(s.charAt(i+1));
                if(firstvalue>=secondvalue){
                    total+=hashmap.get(s.charAt(i));
                }
                else{
                    total-=hashmap.get(s.charAt(i));
                }
            }

        }
        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));

    }
}