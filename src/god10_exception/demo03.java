package god10_exception;

public class demo03 {
    public static void main(String[] args) {
        new demo03().test(1,0);

    }

    public void test(int a,int b){
        if(b==0){//throw throws
            throw new ArithmeticException();
        }

    }
}
////ctrl+alt+T 自动选择包围方式
//        try {
//
//                System.out.println(a/b);
//                } catch (Exception e) {
//                System.exit(1);//直接退出程序，不再执行后面代码
//                throw new RuntimeException(e);
//                } finally {
//                }