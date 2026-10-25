package god09;
//抽象的思维~java-架构师
public interface UserService { //接口都需要有实现类
    //接口中的所有定义其实都是抽象的public,可以看到写出来的public变成灰色了
   //常量： public static final
    int age=99;
    void add(String name);
    void delete(String name);
    void update(String name);
    void check(String name);
}
