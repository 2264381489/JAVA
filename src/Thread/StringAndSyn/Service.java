package Thread.StringAndSyn;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

//如果将string作为锁,那么会出现很多的问题
public class Service {
    public static void print(String stringparm) throws InterruptedException {
        synchronized (stringparm) {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);//不会丢掉锁
            }
        }
    }
}
class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        super.run();
        try {
            service.print("AA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        super.run();
        try {
            service.print("AA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
