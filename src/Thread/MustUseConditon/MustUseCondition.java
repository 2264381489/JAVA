package Thread.MustUseConditon;

import Thread.ConditionTestMoreMethod.MyService;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MustUseCondition {
    Lock lock = new ReentrantLock();//创建锁
    public Condition a = lock.newCondition();//每个条件对象发出的指令只跟自己这个对象的有关系.
    public Condition b = lock.newCondition();//而wait( 这种方法则是对所有都要上锁.所以也正是因此

    public void awaitA() throws InterruptedException {
        lock.lock();//不加锁,condtion对象中的await这些方法是无法使用的.很糟糕
        System.out.println("begin await时间为" + System.currentTimeMillis() + "           " + Thread.currentThread().getName());
        a.await();//等待,看看什么时候回复.
        System.out.println("end await时间为" + System.currentTimeMillis() + "              " + Thread.currentThread().getName());
        lock.unlock();//千万记得解锁,要不然就死锁了
    }

    public void awaitb() throws InterruptedException {
        lock.lock();//不加锁,condtion对象中的await这些方法是无法使用的.很糟糕
        System.out.println("begin awaitB时间为" + System.currentTimeMillis() + "           " + Thread.currentThread().getName());
        b.await();//等待,看看什么时候回复.
        System.out.println("end awaitB时间为" + System.currentTimeMillis() + "              " + Thread.currentThread().getName());
        lock.unlock();//千万记得解锁,要不然就死锁了
    }

    public void signallA() throws InterruptedException {
        lock.lock();//不加锁,condtion对象中的await这些方法是无法使用的.很糟糕
        System.out.println("signall时间为" + System.currentTimeMillis() + "           " + Thread.currentThread().getName());
        a.signalAll();//释放全部锁
        lock.unlock();
    }
//下面的方法并不会被调用,实际上一直到结束,这个都不会被调用.
    public void signallB() throws InterruptedException {
        lock.lock();//不加锁,condtion对象中的await这些方法是无法使用的.很糟糕
        System.out.println("signall时间为" + System.currentTimeMillis() + "           " + Thread.currentThread().getName());
        b.signalAll();//释放全部锁
        lock.unlock();
    }
}

class ThreadA extends Thread {
    private MustUseCondition service;

    public ThreadA(MustUseCondition service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.awaitA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread {
    private MustUseCondition service;

    public ThreadB(MustUseCondition service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.awaitb();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        MustUseCondition mustUseCondition = new MustUseCondition();
        ThreadA threadA = new ThreadA(mustUseCondition);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(mustUseCondition);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(3000);//确保A和B都停止
        mustUseCondition.signallA();
    }
}