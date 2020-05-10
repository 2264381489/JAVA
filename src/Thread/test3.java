package Thread;



public class test3 {
    public static void main(String[] args) {
        method method = new method();
        method method1=new method();
        thread1 thread1 = new thread1("线程A",method);
        thread3 thread3 = new thread3("线程B",method1);
        thread1.start();
        thread3.start();
    }
}
class method{
    private int count=0;
    public void method(){
        String string=new String();
        synchronized (method.class){
            for (int i = 0; i <3; i++) {
                System.out.println(Thread.currentThread().getName()+"   "+i);
            }
        }
    }
}
class thread1 extends Thread{
    private method method1;

    public thread1(String name,method method1) {
        super( name);
        this.method1 = method1;
    }


    @Override
    public void run() {
        super.run();
method1.method();
    }
}
class thread3 extends Thread{
    private method method1;
    public thread3(String name,method method1) {
        super( name);
        this.method1 = method1;
    }
    @Override
    public void run() {
        super.run();
method1.method();
    }
}