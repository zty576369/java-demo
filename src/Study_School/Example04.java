package Study_School;

import java.util.Random;

public class Example04 {
    public static void main(String[] args) {
        //获取运行时对象
        Runtime runtime=Runtime.getRuntime();
        System.out.println("处理器的个数"+runtime.availableProcessors());
        System.out.println("空闲内存"+runtime.freeMemory()/1024/1024);
        System.out.println("---------------");

        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(Math.abs(-99));
        Random random=new Random();
        System.out.println("生成boolean类型的随机数："+random.nextBoolean());
        System.out.println("生成double类型的随机数："+random.nextDouble());
        System.out.println("生成int类型的随机数："+random.nextInt());
        System.out.println("生成0-10 int类型的随机数："+random.nextInt(10));
    }
}
