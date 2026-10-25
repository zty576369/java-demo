package demosum;

class person14{
    static {
        System.out.println("执行了person类中的静态代码块");//只执行一次
    }
}
public class demo14 {
    static {
        System.out.println("执行了测试类中的静态代码块");
    }
    public static void main(String[] args) {
        person14 p=new person14(); //无论new多少个对象，静态代码块只执行一次
        person14 p1=new person14();
    }
}
