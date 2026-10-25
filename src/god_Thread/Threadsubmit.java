package god_Thread;

import java.util.concurrent.Callable;

public class Threadsubmit {
    public static void main(String[] args) {
        new Mythread().start();

        new MyRunnable().run();


    }
}
//继承Thread类
class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println(Mythread.class.getName());
    }
}
//读取Runnable接口
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(MyRunnable.class.getName());
    }
}

//实现callable接口
class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable");
        return 100;
    }
}
