package god_Thread;
//创建线程方式二：实现Runnable接口，重写run()方法，调用start()构造方法创建线程对象
public class TestThread2 implements Runnable {//抽象方法要实现，就必须得重写
//runnable接口里面就是一个run方法，可以查看文档得知
    @Override
    public void run() {//run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---");
        }
    }

    public static void main(String[] args) {
        //创建runnable接口实现类对象
        //main线程，主线程
        //创建一个线程对象
        TestThread2 testThread2=new TestThread2();

        //创建线程对象，通过线程对象来开启我们的线程，代理
        new Thread(testThread2).start();

        for (int i = 0; i < 20; i++) {//更改i的大小，可以更明显看出随机执行
            System.out.println("我在学习多线程-"+i);
        }
    }
}
//runnable接口启动线程：传入目标对象+Thread对象.start()
//Runnable 代表【任务】，Thread 代表【线程】
//把任务塞到 Thread 里面，由线程去执行任务里的`run()`。