package god_Thread;
//礼让线程
//礼让不一定成功，看cpu心情
public class TestYield {
    public static void main(String[] args) {
        new Thread(new MyYield(),"A").start();
        new Thread(new MyYield(),"B").start();
        new Thread(new MyYield(),"C").start();
    }
}

class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"->礼让线程");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"->礼让线程结束");
    }
}
