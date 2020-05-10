package TEST;

public class test3 {
//   method1 method1=new method1();

    public static void main(String[] args) {
        method1 method1=new method1();
        thread1 thread1 = new thread1("线程1",method1);
        thread3 thread3 = new thread3("线程2",method1);
               thread1.start();
               thread3.start();
    }
}
class thread1 extends Thread{
    private method1 method1;

    public thread1(String name,method1 method1) {
        super( name);
        this.method1 = method1;

        String[] str=new String[10];//1,2,3,4,5,6,7,8,9
        for (String string: str) {
            System.out.println(string);
        }
        for (int i = 0; i <str.length ; i++) {
            String string=str[i];
        }
    }

    @Override
    public void run() {
        super.run();
        method1.read();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method1.write();
    }
}
class thread3 extends Thread{
private method1 method1;
    public thread3(String name,method1 method1) {
        super( name);
        this.method1 = method1;
    }
    @Override
    public void run() {
        super.run();
        method1.write();
        method1.read();
//        method1.write();
    }
}
class method1{
    int count=5;
   synchronized public void read(){
        System.out.println(Thread.currentThread()+"     读的值"+count);
    }
   synchronized public void write(){
        count--;
        System.out.println(Thread.currentThread()+"     写的值"+count);
    }
}
