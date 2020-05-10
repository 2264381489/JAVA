package TEST;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        method method = new method();
        thread thread = new thread("一号线程",method);
        thread.start();
        Thread.sleep(1000);
        thread2 thread2 = new thread2("二号线程",method);
        thread2.start();
    }
}
class thread extends Thread{
  private   method method;
    public thread(String name,  method method){
        super(name);
        this.method=method;
    }
    @Override
    public void run() {
        super.run();
//        method.str();
        try {
            method.gong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class thread2 extends Thread{
    private method method;
    public thread2(String name,  method method){
        super(name);
        this.method=method;
    }
    @Override
    public void run() {
        super.run();
        method.str();
        try {
            method.gong();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        method.str();
    }
}
class method{
    private int count=5;
    public void str(){
//        count--;
        System.out.println(Thread.currentThread()+"执行"+count);
    }
     public void gong() throws Exception {
        int i=0;
        while(count==5){
          i++;
            if(i==10){
                throw new Exception("infiniteLoop StopsExecution!");
            }
        }
    }
}
