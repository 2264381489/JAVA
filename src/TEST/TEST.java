package TEST;

import java.util.HashMap;
import java.util.LinkedList;

public class TEST {
}
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put('{','}');
        objectObjectHashMap.put('(',')');
        objectObjectHashMap.put('[',']');
        objectObjectHashMap.put('?','?');
        LinkedList<Character> stack = new LinkedList<Character>() {{ add('?'); }};//加入一个？保证输入两个相同方向的符号可以被识别。]]
        for(int i=0;i<s.length();i++){
            if(objectObjectHashMap.containsKey(s.charAt(i))){
              stack.add(s.charAt(i));
            }else if (objectObjectHashMap.get(stack.removeLast())!=s.charAt(i))return false;//核心就于占的特性，后进先出。以（{[]{}}）为例，
            // 最后一个输入的一对，一定是紧密连接在一起的一对要，不然就不符合题意。也就是说，在运行到[的时候因为紧接着的是]所以自动把[出栈。
            //在运行到{时候，紧接着}就把{也出栈。
        }



  return stack.size() == 1;//保证栈是空的
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean  a= solution.isValid("{[]}");
        System.out.println(a);
    }
}

