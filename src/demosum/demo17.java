package demosum;

class Animal{ //定义animal类
    String name;  //声明name属性
    void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{
    public void printname(){
        System.out.println("name="+name);
    }
}
public class demo17 {
    public static void main(String[] args) {
        Dog dog=new Dog();//创建一个Dog类的实例对象
        dog.name="沙皮狗";//为dog对象的name属性赋值
        dog.printname();//使用dog对象的printname方法
        dog.shout();//使用dog类继承的shout方法
    }
}
