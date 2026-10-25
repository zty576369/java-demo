package God_Syn;
//
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket=new BuyTicket();

        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的你们").start();
        new Thread(buyTicket,"可恶的黄牛党").start();
    }
}
class BuyTicket implements Runnable{
    boolean flag=true;//外部停止方式
    private int tickNums=10;
    @Override
    public void run() {
        while (flag) {
            buyTicket();
        }
    }
    public void buyTicket(){
        //判断是否有票
        if (tickNums<=0){
            flag=false;
            return;
        }
        try {//模拟延时
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"购买了第"+tickNums+"张票");
        tickNums--;
    }
}
