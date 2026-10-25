package demosum;

public class demo16 {
    private static int count=0;
    public demo16(){
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        demo16 c1=new demo16();
        demo16 c2=new demo16();
        demo16 c3=new demo16();
        System.out.println("目前为止创建的对象数："+demo16.getCount());
    }
}