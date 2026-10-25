package god_Thread;
/*
* 静态代理模式：
* 真实对象和代理对象都要实现同一个接口
* 代理对象要代理真实角色
* 好处：代理对象可以做很多真实对象做不了的事情
* 真实事情专注做自己的事情
* */
public class StaticProxy {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("loveyou")).start();

        You you = new You();
        wedding wedding = new wedding(you);
        wedding.HappyMary();
    }
}
interface Marry{//真实角色和代理角色都要实现同一个接口
    void HappyMary();
}
//真实角色
class You implements Marry{
    @Override
    public void HappyMary() {
        System.out.println("某某要结婚了");
    }
}
//代理角色
class wedding implements Marry{
    //代理谁--》真实目标角色
    private Marry target;
    public wedding(Marry target) {
        this.target = target;
    }
    @Override
    public void HappyMary() {
        before();
        this.target.HappyMary();
        after();
    }

    private void after() {
        System.out.println("结束准备");
    }

    private void before() {
        System.out.println("开始准备");
    }
}
