package god_Thread;

public class TestPrority {
//测试线程优先级，主线程默认优先级
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
        MyPriority myPriority=new MyPriority();
        Thread t=new Thread(myPriority);
        Thread t1=new Thread(myPriority);
        Thread t2=new Thread(myPriority);
        Thread t3=new Thread(myPriority);
        Thread t4=new Thread(myPriority);

        //先设置优先级，在启动
        t1.start();
        t2.setPriority(1);
        t2.start();

        t3.setPriority(3);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);//MAX_PRIORITY=10
        t4.start();
    }
}
class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
    }
}