package God_annotation;

import java.lang.annotation.*;

//测试元注解：负责注解其他的注解
public class Test02 {
    @MyAnnocation(name = "")
    public void test() {

    }
}

//定义一个注解
//Target表示我们的注解可以用在那些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retetion表示我们的注解在什么地方还有效
//runtime>class>source
    @Retention(value= RetentionPolicy.RUNTIME)

//表示是否将我们的注解生成在javadoc中
@Documented


@interface MyAnnocation{

    String name();
}
