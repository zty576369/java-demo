package demosum;//class Outer25{
//    public static Outer25 outer;
//    int m=0;
//    void text1(){
//        System.out.println("外部成员方法");
//    }
//    void text2(){
//        //定义局部内部类Inner，在局部内部类中访问外部类变量和方法
//        class  Inner{
//            int n=1;
//            void show(){
//                System.out.println("外部变量m="+m);
//                text1();
//            }
//        }
//        //在创建局部内部类的方法中，调用局部内部类变量和方法
//        Inner inner=new Inner();
//        System.out.println("局部内部类变量n="+inner.n);
//        inner.show();
//    }
//
//    public void test2() {
//    }
//}
//public class demo25 {
//    public static void main(String[] args) {
//        //通过外部类对象调用了创建局部内部类的方法
//        Outer25.outer=new Outer25();
//        Outer25.outer.test2();
//    }
//}

//******************************
//class Outer25{
//    static int m=0;
//    static class Inner{
//        void show(){//静态内部类访问外部类静态成员
//            System.out.println("外部类静态变量m="+m);
//        }
//    }
//}
//public class demo25{
//    public static void main(String[] args) {
//        //静态内部类可以直接通过外部类创建
//        Outer25.Inner inner=new Outer25.Inner();
//        inner.show();
//    }
//}

//********************
interface Animal25{
    void shout();
}
public class demo25{
    public static void main(String[] args) {
        String name="小花";
        animalShout(new Animal25(){
            public void shout(){
                System.out.println(name+"喵喵");
            }
        });
    }

    public static void animalShout(Animal25 an) {
        an.shout();
    }
}
