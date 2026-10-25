package god_Thread;
//测试线程正常停止--利用次数，不建议死循环
//建议使用标志位-->设置一个标志位
//不要使用stop或者destroy或者jdk不建议使用的方法
public class Stop implements Runnable{
    //定义一个标志位
    private boolean flag = true;
    @Override
    public void run() {
        int i=0;
        while(flag){
            i++;
            System.out.println("正在运行");
        }
    }
//设置一个公开的方法转换标志位
    public void stop(){
        flag = false;
    }
    public static void main(String[] args) {
        Stop stop = new Stop();
        new Thread(stop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            if (i==900){
                //调用stop方法，停止线程
                stop.stop();
                System.out.println("线程停止");
            }
        }
    }
}

