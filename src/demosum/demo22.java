package demosum;//abstract class Animal22{
//    public abstract void shout();
//}
//class Dog22 extends Animal22{
//    public void shout(){
//        System.out.println("wangwang");
//    }
//}
//public class demo22 {
//    public static void main(String[] args) {
//        Dog22 dog=new Dog22();
//        dog.shout();
//    }
//}


//........................
interface Animal22{
    int ID=1;//定义全局变量
    void breathe(); //定义抽象方法
    default void getType(String type){ //定义一个默认方法
        System.out.println("the animal belong to"+type);
    }
    static int getID(){//定义一个静态方法
        return Animal22.ID;
    }
}
class Dog22 implements Animal22{//dog实现了animal接口
    public void breathe(){
        System.out.println("dog is breathing");
    }
}
public class demo22{
    public static void main(String[] args) {
        System.out.println(Animal22.getID());
        //通过接口名调用类方法
        Dog22 dog = new Dog22();
        System.out.println(dog.ID);
        //在实现类中获取接口全局变量
        dog.breathe();
        //通过接口实现类dog的实例化对象，使用接口默认方法
        dog.getType("犬科");
    }
}