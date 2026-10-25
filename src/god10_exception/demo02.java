package god10_exception;

public class demo02 {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        try {//代码块,try可以去监控区域
            System.out.println(a/b);
        }catch (Error e){ //捕获异常
            System.out.println("error");
        }
        catch (Throwable t){ //捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally { //不论是否出现异常，都会执行
            System.out.println("finally");
        }
        //finally可以不要，但try catch必要
    }

    public void a(){b();}
    public void b(){a();}
}
