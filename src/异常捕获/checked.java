package 异常捕获;
//使用try...catch语句对异常进行捕获处理如果加上finally就是无论程序是否异常，都运行
//使用throws关键字声明抛出异常，让调用者处理
//异常处理，针对exception类及其子类
public class checked {
    public static int divide(int x,int y)throws Exception{
        int result=x/y;
        return result;
    }

    public static void main(String[] args) throws Exception {
        int result=divide(4,0); //调用divide方法
        System.out.println(result);
    }
}
