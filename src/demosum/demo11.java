package demosum;

class Person11 {
    public Person11() {
        System.out.println("无参的构造方法被调用了...");
    }
    //方法名和类目相同；方法名前面没有方法的返回值
    //构造方法是类的对象被实例化时调用
    public Person11(int age) {
        this();// 调用无参的构造方法
        System.out.println("有参的构造方法被调用了...");
    }
}
public class demo11 {
    public static void main(String[] args) {
        Person11 p = new Person11(18); // 实例化 Person 对象
    }
}