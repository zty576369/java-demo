package demosum;

public class demo6 {

    static class Person{
        int age;

        void speak(){
            System.out.println("我今年"+age+"岁了");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        // p1 = null;  // 这行一定要删掉！
        p1.age = 18;

        p1.speak();
        p2.speak();
    }
}