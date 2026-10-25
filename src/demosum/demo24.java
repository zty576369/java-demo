package demosum;

class Outer{
    int m=0;
    void text1(){
        System.out.println("外部成员方法");
    }
    class Inner{
        int n=1;
        void show1(){
            System.out.println("外部成员变量m="+m);
            text1();
        }
        void show2(){
            System.out.println("内部成员方法");
        }
    }
    void test2(){
        Inner inner=new Inner();
        System.out.println("内部成员变量n="+inner.n);
        inner.show2();
    }
}
public class demo24 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.show1();
        outer.test2();
    }
}
