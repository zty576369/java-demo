package god_Thread;
//创建线程方式一：继承Thread类，重写run()方法，调用start()方法启动线程
public class TestThread extends Thread {
    @Override
    public void run() {//run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("线程"+this.getName()+"运行"+i+"次");
        }
    }

    public static void main(String[] args) {
        //main线程，主线程
        //创建一个线程对象
        TestThread testThread=new TestThread();
        //调用start方法开启线程
        testThread.start();

        for (int i = 0; i < 20; i++) {//更改i的大小，可以更明显看出随机执行
            System.out.println("我在学习多线程-"+i);
        }
    }
/*
* 线程代码不一定立即执行，由cpu调度执行，时分复用技术
*
* */
}
