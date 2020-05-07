package Thread.t6;
//currentThread
public class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造方法的打印"+Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("run方法的打印:"+Thread.currentThread().getName());
    }
}
class Run2{
//    Thread myThread=new MyThread();

    /**
     * 判断不同线程调用MyThread得出的结果
     * 构造方法的打印main
     * run方法的打印:Thread-0
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Thread myThread=new MyThread();
        myThread.start();//构造方法是由main调用的
        Thread.sleep(1000);//必须加上InterruptException
        System.out.println();
        myThread.run();//这就是吊了个方法,还是右main主线程调用的.
    }
}
