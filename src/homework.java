import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class homework {

    public static void main(String[] args) {
        call.callThePhone();
    }

}

class arrearsException extends Exception {
    arrearsException() {
    }
    arrearsException(String msg) {
        super(msg);
    }
}

class call {
    private static int money = 0;
    call(int money) {
        this.money = money;
    }
    public static void callThePhone() {
        if (money - 1 < 0) {
            try {
                throw new arrearsException("手机欠费");
            } catch (arrearsException e) {
                e.printStackTrace();
            }
        }
    }
}
class login{
    String id="yanzezhong";
    String password="a1234";
    HashMap<String,String> hashMap=new HashMap<>();
    login(){
        hashMap.put(id,password);
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
        int i=0;
        boolean flag=false;
        List<Character> list=new LinkedList<>();
        //任何一个字符串结束就停止
        while(num1.length()>=i&&num2.length()>=i){
            int num=num1.charAt(i)+num2.charAt(i);
            if(flag){
                num+=1;
                flag=false;
            }
            if(num>10)flag=true;
            list.add(num%10);
            i++;
        }
        String str=list.toArray(String);
        //如果长度不一样
        return    num1.length()>num2.length()?str+num1.substring(i,num1.length()-1):str+num2.substring(i,num2.length()-1);


    }
}