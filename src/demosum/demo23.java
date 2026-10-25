package demosum;//abstract class Animal23{
//abstract void shout();}
//class Cat extends Animal23{
//    public void shout(){
//        System.out.println("miaomiao");
//    }
//}
//class Dog23 extends Animal23{
//    public void shout(){
//        System.out.println("wangwang");
//    }
//}
//public class demo23 {
//    public static void main(String[] args) {
//        Animal23 an1=new Cat();
//        Animal23 an2=new Dog23();
//        an1.shout();
//        an2.shout();
//
//
//    }
//}//java中提供了一个关键字instance of，可以判断一个对象是否为某个类或者接口的实例


//****************************************
//定义接口Animal
interface Animal23 {
    void shout(); // 定义抽象shout()方法
}
//定义Cat类实现Animal接口
class Cat implements Animal23 {
    // 实现接口shout()方法
    public void shout() {
        System.out.println("喵喵......");
    }
    // 定义Cat类特有的抓老鼠catchMouse()方法
    public void catchMouse() {
        System.out.println("小猫抓老鼠......");
    }
}
//定义Dog类实现Animal接口
class Dog23 implements Animal23 {
    // 实现接口shout()方法
    public void shout() {
        System.out.println("汪汪......");
    }
}
//定义测试类
public class demo23 {
    public static void main(String[] args) {
//  Animal an1 = new Dog();
//  Cat cat = (Cat) an1;
//                      cat.shout();
//  cat.catchMouse();
        Animal23 an1 = new Dog23();
        if(an1 instanceof Cat){ // 判断an1本质类型
     Cat cat = (Cat) an1;
     cat.shout();
     cat.catchMouse();
        }else{
            System.out.println("该类型的对象不是Cat类型！");
        }
    }
}