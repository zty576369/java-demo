package god07;

public class Student {
    private static int age; //静态变量  多线程会用到
    private double score; //非静态变量

    public void run(){

    }
    public static void go(){
        System.out.println("go");
    }

    public static void main(String[] args) {
        Student.go();
    }
}
