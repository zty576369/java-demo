package god05;
//继承
public class A extends B {
    //alt+insert快捷键可以直接写入重写方法
    @Override
    public void test() {
        System.out.println("A=test");
    }
}
/*
* 重写的条件：需要有继承关系，而且是子类重写父类的方法
* 必须是非静态情况，方法名，参数列表，否则参数列表不同是重载需相同
* 修饰符可以扩大，但不能缩小，public可以，但是private不行
* 抛出的异常：范围可以被缩小，但不能扩大，与修饰符相反，继承的异常只能小于父类，不能大于父类
*为什么需要重写：父类的功能子类不一定需要，或者不一定满足
*
* */