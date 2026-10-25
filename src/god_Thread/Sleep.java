package god_Thread;

import god_Thread.TestThread3;

//模拟网络延时和计算时间
//每个对象都有一把锁，sleep不会释放锁
public class Sleep implements Runnable {
    private int ticket=10;
    //线程体
    @Override
    public void run() {
        while(true){
            if(ticket<=0){
                break;
            }
            try {//模拟延时
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"->拿到了第"+ticket+"张票");
            ticket--;
        }
    }

    public static void main(String[] args) {
        //避免多个线程不安全
        TestThread3 ticket=new TestThread3();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"老王").start();
        new Thread(ticket,"美女").start();
    }
}
