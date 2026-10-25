package 异常捕获;

public class checked2 {
    public static int divide(int x,int y)throws Exception{
        int result=x/y; //定义两数相除的结果
        return result;  //返回结果
    }
    public static void main(String[] args) {
        try{
            int result=divide(4,0);//调用divide方法
            System.out.println(result);
        }
        catch (Exception e){  //对捕获到的异常进行处理
            System.out.println("被捕获的异常信息为："+e.getMessage());
        }
    }
}
