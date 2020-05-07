package Thread.t7_isAlive;

/**
 *  test isAlive()方法
 */
public class MyThread extends Thread {
    public void run(){
        System.out.println("run="+this.isAlive());
    }
}


class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin==" + myThread.isAlive());//不给start测试开始
        myThread.start();
        System.out.println("begin==" + myThread.isAlive());//开启start测试开始
/**
 * begin==false
 * begin==true
 * run=true
 *  In thread run()执行的顺序和在测试类中函数执行的顺序并不一定,是随机的.所以如果想让相互不影响,就应该用sleep,下面哪个函数就是例子
 */
    }

}
class Run1{
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin==" + myThread.isAlive());//不给start测试开始
        myThread.start();
        Thread.sleep(1000);
        System.out.println("begin==" + myThread.isAlive());//因为线程已经执行完毕,所这个也是false
        /**
         * begin==false
         * run=true
         * begin==false
         */
    }
}