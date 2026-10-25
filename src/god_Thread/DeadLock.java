package god_Thread;
//死锁：多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1=new Makeup(0,"女孩");
        Makeup g2=new Makeup(1,"公主");
        g1.start();
        g2.start();
    }
}


class Lipstick{

}

class Mirror{

}
class Makeup extends Thread {
    //需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;
    String name;

    Makeup(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void makeup() throws InterruptedException {//互相持有对方的锁,需要拿到对方的资源
        if (choice == 0) {
            synchronized (lipstick) {//获得口红的锁
                System.out.println(name + "获得口红的锁");
                Thread.sleep(1000);
                //这里放了一把锁，会导致死锁
                synchronized (mirror) {//获得镜子的锁
                    System.out.println(this.name + "获得镜子的锁");
                }

            }
        }
        else {//这里放了两把锁，不会导致死锁，让两个进程不存在同时抢一个资源
            synchronized (mirror) {//获得镜子的锁
                System.out.println(name + "获得镜子的锁");
                Thread.sleep(2000);


                }
            }synchronized (lipstick) {//获得口红的锁
            System.out.println(this.name + "获得口红的锁");
        }
    }
}