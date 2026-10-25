package God_Syn;

public class UnsafeBank {
    public static void main(String[] args) {
        Account account=new Account(10,"张三");
        Drawing2 you=new Drawing2(account,5,account.money);
        Drawing2 girl=new Drawing2(account,10,account.money);
        you.start();
        girl.start();
    }
}
//账户
class Account{
    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

    int money=1000000;
    String name;
}
//银行
class Drawing extends Thread {
    Account account;
    int drawingMoney;
    int nowMoney;

    public Drawing(Account account, int drawingMoney, int nowMoney) {
        super();
        this.account = account;
        this.drawingMoney = drawingMoney;
        this.nowMoney = nowMoney;
    }
    @Override
    public void run() {//添加synchronized关键字
        if (account.money-drawingMoney<0){
            try {//sleep会放大问题的发生性
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"余额不足");
            nowMoney=nowMoney+drawingMoney;
            System.out.println(Thread.currentThread().getName()+"当前余额为"+nowMoney);
            System.out.println(this.getName()+"取了"+drawingMoney+"元");
        }
    }
}// ... existing code ...
//银行
class Drawing2 extends Thread {
    Account account;
    int drawingMoney;
    int nowMoney;

    public Drawing2(Account account, int drawingMoney, int nowMoney) {
        super();
        this.account = account;
        this.drawingMoney = drawingMoney;
        this.nowMoney = nowMoney;
    }
    @Override
    public void run() {
        // Check if balance is sufficient first
        if (account.money < drawingMoney) {
            System.out.println(Thread.currentThread().getName() + "余额不足");
            return;
        }

        try {
            // Sleep to amplify race condition, ensure both threads pass the check before withdrawal
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Actual unsafe withdrawal operation
        account.money -= drawingMoney;

        System.out.println(Thread.currentThread().getName() + "取了" + drawingMoney + "元");
        System.out.println(Thread.currentThread().getName() + "当前账户余额为" + account.money);
    }
}
// ... existing code ...
