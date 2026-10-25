package 异常捕获;
//上联类似构造类，下联是对象，类表示方式方法，对象表示具体数据
public class checked6 {
    public static int divide(int x,int y)throws  checked5{
        if (y==0){
            throw new checked5("除数是0");
        }
        int result=x/y;
        return result;
    }

    public static void main(String[] args) {
        try{int result=divide(4,0);
            System.out.println(result);
    }
        catch (checked5 e){
            System.out.println("被捕获的异常信息为："+e.getMessage());
        }
    }
}
