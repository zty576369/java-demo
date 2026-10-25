package god_Thread;

import java.util.concurrent.*;

public class TestPool {
    public static void main(String[] args) {
        //创建服务，创建线程池.参数为线程池大小
        ExecutorService service= new ThreadPoolExecutor(10,10,0L, TimeUnit.MICROSECONDS,new LinkedBlockingQueue<>(10));
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        //关闭连接
        service.shutdown();
    }
}
class MyThread implements Runnable {
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}
