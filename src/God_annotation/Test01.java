package God_annotation;

import java.util.ArrayList;
import java.util.List;

//什么是注解，以下是内置注解
public class Test01 extends Object{
    //重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated//废弃的注解 不推荐使用
    public static void test(){
        System.out.println("test");
    }

    @SuppressWarnings("unchecked")
    public void test2(){
        List list=new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
