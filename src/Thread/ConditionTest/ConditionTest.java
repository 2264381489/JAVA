package Thread.ConditionTest;

import java.util.concurrent.locks.*;

public class ConditionTest {
    private ReentrantLock lock1 = new ReentrantLock();
    private Condition condition = lock1.newCondition();
    private boolean hasValue = false;

    public void set() throws InterruptedException {
        lock1.lock();//先锁住,这样所有访问这个线程的内容就全都卡住了.
//        while (hasValue) {
//            condition.await();
//        }//用循环才能卡住线程,要不然一会一格Signall又全起来了
        hasValue = true;
        Thread.sleep(1000);
        System.out.println("set调用了几次lock"+lock1.getQueueLength());
        condition.signal();
        get();
        lock1.unlock();
    }

    public void get() throws InterruptedException {
        lock1.lock();//先锁住
        while (!hasValue) {
            condition.await();
        }//用循环才能卡住线程,要不然一会一格Signall又全起来了
        hasValue = false;
//        System.out.println("get锁住了多少个"+lock1.getQueueLength());
        condition.signal();
        lock1.unlock();
    }
}

class ThreadA extends Thread {
    private ConditionTest service;

    public ThreadA(ConditionTest service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                service.set();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread {
    private ConditionTest service;

    public ThreadB(ConditionTest service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                service.set();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class test {
    public static void main(String[] args) {
        ConditionTest conditionTest = new ConditionTest();
        for (int i = 0; i < 4; i++) {
            ThreadA threadA = new ThreadA(conditionTest);
            threadA.start();
        }



//        ThreadA threadA = new ThreadA(conditionTest);
//        threadA.setName("A");
//        threadA.start();
//        ThreadB threadB = new ThreadB(conditionTest);
//        threadB.start();
    }
}
