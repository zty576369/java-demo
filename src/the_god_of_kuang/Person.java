package the_god_of_kuang;
//java ---> class
//一个类即使什么都不写，它也会系统自动定义一个存在
public class Person {
    String name;
    //1.使用new关键字，本质调用构造器
    //2.用来初始化值
    public Person(){
        //this.name="qinjiang";
    }
    //有参构造:定义了构造，无参构造就必须显示定义
    public Person(String name){
        this.name=name;
    }

    public Person(int age) {
        this.age = age;
    }

    int age;
}
 /*
 * 构造器：
 * 1.和类名相同
 * 2.没有返回值
 * 作用：
 * 1.new本质在调用构造方法
 * 2.初始化对象值
 * 注意点：
 * 1.定义有参构造之后，如果想使用无参构造，显示的定义一个无参的构造
 * alt+insert快捷键可以快速构造一个参数
 * 3.对象的引用：引用类型（8）种
 * 对象是通过引用来操作的：栈-->堆（地址），其实就是访问对象在堆中的地址
 * 4.属性：字段field成员变量
 * 默认初始化：数字：0 0.0 char：u0000 boolen：false 引用：null
 * 5.对象的创建和使用：
 * -必须使用new关键字创造对象，构造器 Person ty=new Person
 * -对象的属性 ty.name
 * -对象的方法 ty.sleep()
 * 封装 继承 多态 三大抽象
 * */