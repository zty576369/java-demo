package Study_School;

public class Example01 {
    String name="xiaowang";
    String food=new String("吃鸡蛋");

    public static void main(String[] args) {
        //创建空字符串
        String s1=new String();//这里是空字符串，输出不显示结果，为空

        //创建指定字符串内容的字符串对象
        String s2 = new String("abc");

        //根据指定字符数组创建字符串对象
        char[] chars=new char[]{'A','B','C'};
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(chars);
        System.out.println("-----------------");
        String s4="abcdsc";
        //获取字符串长度
        System.out.println(s4.length());

        //字符串中的第一个字符
        System.out.println(s4.charAt(0));

        //字符串c第一次出现的位置
        System.out.println(s4.indexOf('c'));

        //字符cc最后一次出现的索引
        System.out.println(s4.lastIndexOf('c'));

        //去除s5里面的空格
        String s5="   http://laclahost:8080   ";
        System.out.println(s5.trim());

        //字符串替换操作
        System.out.println(s5.replace(" ",""));

        String s6="Starter";
        System.out.println(s6.startsWith("St"));//以什么为开头，是为true，不是为false
        System.out.println(s6.endsWith("ee"));//以什么结尾

        //判断字符串是否包含字符
        System.out.println(s6.contains("ZTY"));
        //判断两个字符串是否相等
        String s7="end";
        System.out.println(s6.equals(s7));

        String s8="2026-10-12";
        //从第6个字符截取到末尾
        System.out.println(s8.substring(5));
        //从第6个字符截取到第8个字符
        System.out.println(s8.substring(5,8));
        System.out.println("--------------------");
        //字符串分割
        String[] s88=s8.split("-");
        for(int i=0;i<s88.length;i++){
            System.out.println(s88[i]);
        }
        System.out.println("-----------------");
    }
}
