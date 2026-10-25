package god_Thread;

public class TestDaemon {
    public static void main(String[] args) {
        God god=new God();
        Me me=new Me();

        Thread thread=new Thread(god);
        thread.setDaemon(true);

        thread.start();//上帝线程启动
        new Thread(me).start();//用户线程启动
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("我是上帝，我正在工作");
        }
    }
}
class Me implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("我是一个人，我正在工作");
        }
        System.out.println("hello world");
        }
}
