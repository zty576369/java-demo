package Study_School;

import java.util.Properties;
import java.util.Set;

public class Example03 {
    public static void main(String[] args) {
        //获取当前时间
        long startTime=System.currentTimeMillis();
        //获取当前系统属性
        Properties properties=System.getProperties();
        System.out.println(properties);
        //获取所有属性的名称
        properties.stringPropertyNames();
        //获取系统属性中的所有key
        Set<String> propertyNames=properties.stringPropertyNames();
        for( String name:propertyNames){
            String value=System.getProperty(name);
            System.out.println(name+":"+value);
        }
        System.out.println("--------------");
        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序执行消耗的时间为："+(endTime-startTime)+"毫秒");
    }
}
