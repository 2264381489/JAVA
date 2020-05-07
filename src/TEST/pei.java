package TEST;

public class pei {
    static final double PIE=3.1415926;//
    static pei1Test p=pei1Test.PIE;
    public static void main(String[] args) {
        System.out.println("常量开始执行"+System.currentTimeMillis());
        System.out.println(PIE);
        System.out.println("常量结束执行"+System.currentTimeMillis());
        System.out.println("枚举结束执行"+System.currentTimeMillis());
        System.out.println(p.getValue());
        System.out.println("枚举结束执行"+System.currentTimeMillis());
    }
}
