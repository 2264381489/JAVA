package Thread.t8_sleep;

public class MyThread1 extends Thread {
    /**
     * 测试sleep方法
     */
    public void run(){
        System.out.println("run threadNmae="+currentThread().getName()+"begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("tun threadName="+currentThread().getName()+"end");
    }
}
 class Run1{
     public static void main(String[] args) {
         MyThread1 myThread1=new MyThread1();
         System.out.println("begin="+System.currentTimeMillis());
         System.out.println(Thread.currentThread().getId());//如果想要调用本地类,就用getID(
         myThread1.run();
         System.out.println("end="+System.currentTimeMillis());
         /**
          * begin=1588817375420
          * run threadNmae=mainbegin
          * tun threadName=mainend
          * end=1588817377421
          * begin和end之间差了2000
          * 正好是两秒--设定的值
          */

     }
}

