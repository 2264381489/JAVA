package Thread.t11_停止线程.t12_interrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <500000 ; i++) {
            System.out.println(i);
        }
    }
}
class Run{
    public static void main(String[] args) throws InterruptedException {


        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("是否停止"+thread.interrupted());//false
        System.out.println("是否停止:"+thread.interrupted());//false
        //这是因为isInterrupted判断的是当前线程,这个当前线程就是 main main一直没有给过中断
        System.out.println("end!");
    }
}
class Run2{
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println(Thread.currentThread().interrupted());
        System.out.println(Thread.currentThread().interrupted());
        /**
         * true
         * false
         * interrupted(会发生置位
         */
    }
}
//如何正确使用isInterrupted
class RUN3{
    public static void main(String[] args) throws InterruptedException {
        MyThread thread=new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("是否停止1?"+thread.isInterrupted());//true
        System.out.println("是否停止2?"+thread.isInterrupted());//true
    }
}