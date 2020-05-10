package TEST;

public class HOMEWORK1 {
    public static void main(String[] args) throws InterruptedException {

        Runnable home = new home();
        System.out.println("线程不共享资源");
        home1 home1 = new home1();
        home1 home2 = new home1();
        home1.start();
        home2.start();
        Thread.sleep(1000);
        System.out.println("线程共享资源");
        Thread thread = new Thread(home,"一号线程");
        Thread thread1 = new Thread(home,"二号线程");
        Thread thread3 = new Thread(home,"三号线程");
        thread.start();
        thread1.start();
        thread3.start();
    }
}
class home extends Thread {
    private int count=5;
    synchronized public void  run() {
        count--;
        System.out.println(Thread.currentThread()+"    的值为"+count);
    }
}
class home1 extends Thread {
    private int count=5;
    public void run() {
        count--;
        System.out.println(Thread.currentThread()+"    的值为"+count);
    }
}