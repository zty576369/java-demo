package demosum;

public class demo3 {
    public static void main(String[] args) {
    //第一种方式定义数组
        int[] ids=new int[100];
        System.out.println("ids[0]"+ids[0]);
        System.out.println("ids[99]"+ids);
        System.out.println("=============");
    //第二种方式定义数组
    String[] names=new String[]{"张三","tom","jack"};
        System.out.println("names[0]="+names[0]);
        System.out.println("names[2]="+names[2]);
        System.out.println("--------------");
    //第三种方式定义数组
    Object[] object={"张三","tom","jack"};
        System.out.println("数组的长度为："+object.length);
        System.out.println("object[0]="+object[0]);
        System.out.println("object[2]="+object[2]);


    }
}
