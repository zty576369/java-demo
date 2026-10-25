package god_Thread;
//多个县城同时操作同一个对象
//买票例子
//多个线程同时操作同一个对象，会导致数据不一致，不安全
public class TestThread3 implements Runnable {
    private int ticket=10;
    //线程体
    @Override
    public void run() {
        while(true){
            if(ticket<=0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"->拿到了第"+ticket+"张票");
            ticket--;
        }
    }

    public static void main(String[] args) {
        TestThread3 ticket=new TestThread3();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"老王").start();
        new Thread(ticket,"美女").start();
    }
}
