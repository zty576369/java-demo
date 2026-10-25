package demosum;

class Animal_1{
    void shout(){
        System.out.println("the animal is shouting");
    }
}
class Dog_1 extends Animal_1{
    void shout(){
        System.out.println("wang wang");
    }
}
public class demo18 {
    public static void main(String[] args) {
        Dog_1 dog =new Dog_1();
        dog.shout();
        dog.shout();
    }
}
