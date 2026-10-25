package demosum;

class Animal_2{
    String name="animal";
    void shout(){
        System.out.println("the animal is shouting");
    }
}
class Dog2 extends Animal_2{
    String name="the kinds of dog";//overridde the member methods of the parent class
    void shout(){
        super.shout();//access the member methods of the parent class
    }
    void printname(){
        System.out.println("name="+super.name);
    }
}
public class demo19 {
    public static void main(String[] args) {
        //create an object of dog
        Dog dog=new Dog();//call the shout method overrridden by the dog object
        dog.shout();
        dog.printname();
        //call the printfname method overrridden by the dog object
    }
}
