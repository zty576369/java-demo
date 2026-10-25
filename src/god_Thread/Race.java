package god_Thread;
//模拟龟兔赛跑
//equals():比较对象里面的内容值是否相等
public class Race implements Runnable {
    private  static String winner;
    //线程体
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            boolean flag=gameover(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }
    private boolean gameover(int step){
        if(winner!=null){
            return true;
        }if (step==100){
            winner=Thread.currentThread().getName();
            System.out.println("winner is "+winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race=new Race();
        new Thread(race,"龟").start();
        new Thread(race,"兔").start();
    }
}
