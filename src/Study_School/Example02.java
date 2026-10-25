package Study_School;

public class Example02 {
    public static void main(String[] args) {
        System.out.println("添加");
        add();    //增加测试类
        System.out.println("-----------------");
        delete();//删除测试类
        System.out.println("-----------------");
        update();//改变测试类
        System.out.println("-----------------");

        }
    public static void add(){
        //方法体，定义一个字符串缓冲区
        StringBuffer stringBuffer=new StringBuffer();
        //添加字符串
        stringBuffer.append("ABC");
        System.out.println("append结果："+stringBuffer);

        //在指定位置插入字符串
        stringBuffer.insert(3,"DE");
        System.out.println("insert添加结果"+stringBuffer);
    }

    public static void delete(){
        StringBuffer stringBuffer=new StringBuffer("ABCDEFG");
        //删除指定范围的字符串
        stringBuffer.delete(3,7);
        System.out.println("delete删除后的结果"+stringBuffer);
    }

    public static void update(){
        StringBuffer stringBuffer=new StringBuffer("ABCDSD");
        //改变指定字符串
        stringBuffer.setCharAt(3,'T');
        System.out.println("修改后的数据为："+stringBuffer);
    }

}
