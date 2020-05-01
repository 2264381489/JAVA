import java.util.HashMap;

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