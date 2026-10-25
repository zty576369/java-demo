package god06;

public class Person {
//    public void run(){
//        System.out.println("run");
//
//    }
}
/*
* 多态注意事项：
* 1.多态是方法的多态，不是属性的多态
* 2.父类和子类，强转的话会有强制转换
* 3.子类可以更改父类，但父类不能 classcastException
* 4.存在的条件：有继承关系，方法需要重写，比如都是run方法，父子都有此方法的时候
* 执行子类的方法,因为子类继承了父类，同时子类又重写了父类的方法
* 例子可以看到，子类写了son，父类写的是run，父类引用指向子类对象->Father f1=new son();
*
* 那些方法不能重写：1.static方法，属于类，他不属于实例
* 2.final常量：它不能被修改，是最终形态的意思
* 3.private方法，它是私有的，不可被更改
*
* */