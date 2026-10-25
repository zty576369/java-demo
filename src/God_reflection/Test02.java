package God_reflection;
//测试class类的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("这个人是："+person.name);
        //方式一：通过对象获得
        Class c1=person.getClass();
        System.out.println(c1.hashCode());

        //方式二：forname获得
        Class c2=Class.forName("God_reflection.Student");
        System.out.println(c2.hashCode());

        //方式三：通过类名.class获得
        Class c3=Student.class;
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个TYPE属性
        System.out.println(Integer.TYPE);//默认基本类型是int

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}
class Person{
    public String name;

    public Person() {//无参构造方法
    }
    public Person(String name){//有参构造方法
        this.name=name;
    }

    @Override
    public String toString() {//重写toString方法
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name="教师";
    }
}

