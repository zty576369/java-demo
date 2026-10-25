package god06;

import god06.Person;

public class Student extends Person {
//    //@Override
//    public void run(){
//        System.out.println("son");
//    }
//
//    public void eat(){
//        System.out.println("eat");
//    }
    public void go(){
        System.out.println("go");
    }
}
/*
* //上面是多态的例子，下面是instanceof例子
        //object>string
        //object>Person>Student
        //object>Person>Teacher

       // System.out.println(X instanceof Y); 能不能编译通过，取决于x与y之间是否存在父子关系，有就通过，无就不通过
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("-------------------------");
        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
      //  System.out.println(person instanceof String);//编译报错。因为person是人，不属于string类型
        System.out.println("-------------------------");
        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
    //    System.out.println(student instanceof Teacher);//编译报错，学生和老师是同一级关系，属于person
    //    System.out.println(student instanceof String);//编译报错，不属于string类型
* */