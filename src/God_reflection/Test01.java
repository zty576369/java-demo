package God_reflection;

public class Test01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的class对象
        Class<?> C1 = Class.forName("God_reflection.User");
        System.out.println(C1);
        Class<?> C2 = Class.forName("God_reflection.User");
        Class<?> C3 = Class.forName("God_reflection.User");
        Class<?> C4 = Class.forName("God_reflection.User");
        System.out.println(C2.hashCode());
        System.out.println(C3.hashCode());
        System.out.println(C4.hashCode());
        //一个类在内存中只存在一个class对象，这里可以通过hashcode来查看他们的地址值
        //一个类被加载后，类的整个结构都会被封装在class对象中
    }
}
//实体类:pojo entity
class User{
    private String name;
    private int age;
    private String id;
    public User(){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}

