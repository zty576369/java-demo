package Study_School;

public class Example06 {
    public static void main(String args[]) {
        int num = 123;
        // 1、通过String.valueOf()方法将基本类型转换为字符串
        String string = String.valueOf(num);
        System.out.println("将int变量转换为字符串的结果：" + string);
        // 2、通过包装类的valueOf()静态方法将基本类型和字符串转换为包装类
        String str = "998";

        Integer integer = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(str);
        System.out.println("将int变量转换为包装类的结果：" + integer);
        System.out.println("将字符串变量转换为包装类的结果：" + integer2);
        // 3、通过包装类的有参构造方法将基本类型和字符串转换为包装类

    //    Integer integer3 = new Integer(num); 性能浪费，从JDK9开始移除，目前JDK9以下还可以继续使用，但是高版本已经屏除
    //    Integer integer4 = new Integer(str); 因为每次调用会强制创建一个新的interger对象

        // int 转 Integer
        Integer integer3 = Integer.valueOf(num);//静态工厂方法 Integer.valueOf() 内置了整数缓存机制
        // String 转 Integer
        Integer integer4 = Integer.valueOf(str);

        System.out.println("通过构造器将int变量转换为包装类的结果：" + integer3);
        System.out.println("通过构造器将字符串变量转换为包装类的结果：" + integer4);
        // 4、通过包装类的parseXxx()静态方法将字符串转换为基本数据类型
        int parseInt = Integer.parseInt(str);
        System.out.println("将字符串转换为基本类型的结果：" + parseInt);
        // 5、通过包装类的toString()方法将包装类转换为字符串
        String string2 = integer.toString();
        System.out.println("将包装类转换为字符串的结果：" + string2);
    }
}

