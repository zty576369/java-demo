package god05;

public class Application {
    public static void main(String[] args) {
        //静态方法：方法的调用只和左边，定义的数据类型有关
        //非静态：重写
        A a=new A();
        a.test();
//父类的引用指向子类
        B b=new A();//子类重写了父类的方法，但这种只跟非静态方法有关
        b.test();
    }
}
//静态与非静态方法区别很大
