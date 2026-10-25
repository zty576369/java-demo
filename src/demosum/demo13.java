package demosum;

class Person13{
    public static void say(){ //say是一个静态方法。普通方法属于对象。
        System.out.println("hello!");
    }
}
public class demo13 {
    public static void main(String[] args) {//用类名，调用person
        Person13.say();
        //方式2，先new一个对象，再用对象调用静态方法
        Person13 person13=new Person13();
        Person13.say();
    }
}