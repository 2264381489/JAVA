package Thread.t11_停止线程;

public class MyThread extends Thread {
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
    }
}
class RUN{
    /**
     * 完整的执行了程序,说明
     * interrupt并没有中断程序,正常来讲是要用5000000这种大数据的,但是电脑不好就用100代替.
     * 所以这里要假设一下,主线程停止大的两秒中,myThread线程不会消失.
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();//中断信号
    }
}
