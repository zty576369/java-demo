package 异常捕获;

public class checkde3 {
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }

    public static void main(String[] args)throws Exception {
        //调用divide方法，使用throw将异常抛出
        int result=divide(4,0);
        System.out.println(result);
    }
}
