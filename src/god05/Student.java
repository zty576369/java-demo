package god05;

public class Student extends Person {
    private String name="god";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
/*
1.super调用父类的构造方法，必须在构造方法的第一个
2.super必须只能出现在子类的方法或者构造方法中
3.super和this不能同时调用构造方法

1.this本身调用这个对象
super代表父类对象的应用
前提：this没有继承者也可以使用
super只能在继承条件下才可以使用
构造方法：
this（）；本类的构造
super（）；父类的构造
 */