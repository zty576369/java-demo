package god_Thread;
//推导lamda表达式
//alt+n导入包
public class Lamda {
    //静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lamda() {
            System.out.println("我喜欢-2");
        }
    }

    //局部内部类
    static class Like3 implements Ilike{
        @Override
        public void lamda() {
            System.out.println("我喜欢-3");
        }
    }



    public static void main(String[] args) {
        Ilike like = new Like();
        like.lamda();

        like = new Like2();
        like.lamda();

        like= new Like3();
        like.lamda();

        //匿名内部类
        like=new Ilike(){
            @Override
            public void lamda() {
                System.out.println("我喜欢-4");
            }
        };
        like.lamda();

        //lamda表达式
        like=()->{
            System.out.println("我喜欢-5");
        };
        like.lamda();
    }
}


//定义一个函数式接口
interface Ilike{
    void lamda();
}
//实现类
class Like implements Ilike{
    @Override
    public void lamda() {
        System.out.println("我喜欢");
    }
}
