package god_Thread;

import java.util.concurrent.locks.ReentrantLock;

public class Testlock {
    public static void main(String[] args) {
        TesstLock tesstLock=new TesstLock();
        new Thread(tesstLock,"线程1").start();
        new Thread(tesstLock,"线程2").start();
        new Thread(tesstLock,"线程3").start();
    }
}
class TesstLock implements Runnable{
    int num=10;
    //定义lock锁
    private final ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
        try {
            lock.lock();//加锁
            if (num > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(num--);
            } else {
                break;
            }
        }    finally {//如果有异常，需要将unlock写入finally代码块
                lock.unlock();//解锁
            }
        }
    }
}
//lock是手动的，手动加锁和解锁
//synchronized是自动的，不需要手动加锁和解锁,出了作用域自动解锁
