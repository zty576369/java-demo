package 异常捕获;
//自定义异常
public class checked5 extends  Exception{
    public checked5(){
        super();//调用Exception的无参构造方法
    }
    public checked5(String message){
        super(message);//调用Exception的有参构造方法
    }
}
