package Thread.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();//声明锁对象

    public void methodA() throws InterruptedException {
        lock.lock();//所住
        System.out.println("MethodA    :" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis() + "start");
//        Thread.sleep(5000);//停止一段时间看看会不会被劫走
        System.out.println("MethodA    :" + Thread.currentThread().getName() + "time" + System.currentTimeMillis() + "end");
        lock.unlock();//解除锁定
    }

    public void methodB() throws InterruptedException {
        lock.lock();
        System.out.println("MethodA    :" + Thread.currentThread().getName() + "time" + System.currentTimeMillis() + "start");
//        Thread.sleep(5000);
        System.out.println("MethodB    :" + Thread.currentThread().getName() + "time" + System.currentTimeMillis() + "end");
        lock.unlock();
    }
}

class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.methodB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.methodB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Test {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");//这是Thread自带的方法
        threadA.start();
        ThreadAA threadAA = new ThreadAA(myService);
        threadAA.setName("AA");
        threadAA.start();
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadB.start();
        ThreadBB threadBB = new ThreadBB(myService);
        threadBB.setName("BB");
        threadBB.start();
    }
}
