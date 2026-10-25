package god06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Person();
        //new Student();

        //可以指向的引用类型不确定;父类的引用指向子类

        //student能调用的方法都是自己的或者继承父类的
//        Student s1=new Student();
//        //person是父类型，虽然可以指向子类，但是不能调用子类的方法
//        Person s2 = new Student();
//        Object s3 = new Student();
//        //对象能执行那些方法，主要看对象左边的类型，和右边关系不大
//      //  s2.run();//子类重写了父类的方法，执行子类的方法
//        s1.eat();

    //类型之间的转换：父   子 高转低要强制转换，低转高不用
        //  高                 低
        Person obj = new Student();
        //student将这个对象转换为student类型，就可以使用student类型的方法
        Student student=(Student) obj;//两种
        ((Student) obj).go();//1种
        student.go();
        //两种办法都是强制转换

        //注意：子类转换为父类，可能会丢失一些自己的方法，因为要满足父类的方法
        //父类引用指向子类对象
        //子类转为父类，向上转型，默认可以转换
        //父类转为子类，向下转型，需要强制转换
        //方便方法的调用，不用重新去new一个类，就可以使用父/子类的方法，减少程序代码量，提高利用率

    }
}
