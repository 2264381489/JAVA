package Thread.t4;
//让多个线程共享一个对象
public class MyThread extends Thread {//也可以当作Runnable对象传入Thread中
    private  int count=5;
    public void run(){
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算count"+count);
    }
}
class MyThread1 extends Thread {//也可以当作Runnable对象传入Thread中
    private  int count=5;
   synchronized public void run(){  //加入同步
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算count"+count);
    }
}
//测试函数
class  Run{
    public static void main(String[] args) {
        MyThread1 thread=new MyThread1();//可以当作Ruannable对象
        Thread a=new Thread(thread,"A");
        Thread b=new Thread(thread,"B");//可以传名字进来
        Thread c=new Thread(thread);//只有同一个对象才会产生多线程的问题,如果是两个不同的对象,就不会发生资源抢夺的问题
        a.start();
        b.start();
        c.start();
        /**
         * 调用MyThread()作为Runnable实例
         * 调用
         * 正确的情况
         * 4
         * 3
         * 2
         * 真实的情况
         * 由B计算count2
         * 由Thread-1计算count2
         * 由A计算count2
         * 说明发生了非线程安全问题
         * 其原因在于
         * i--是由三步构成的
         * 1.取得原有的i值
         * 2.计算i-1
         * 3.对i进行赋值
         */
        //使用另一个方法,加入同步,发生改变
        /**
         * 调用MyThread1()作为Runnable实例
         * 由Thread-1计算count4
         * 由B计算count3
         * 由A计算count2
         */
        //是预期中的样子
    }
        }
