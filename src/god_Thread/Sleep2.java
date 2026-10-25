package god_Thread;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class Sleep2  {
    public static void main(String[] args) throws InterruptedException {
        tenDown();
        //打印当前系统时间
        Date startTime=new Date(System.currentTimeMillis());
        System.out.println(startTime);
        try {
            while (true){
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime));
                startTime=new Date(System.currentTimeMillis());//更新当前时间
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void tenDown() throws InterruptedException {
        int num=10;
        while(num>=0){
            Thread.sleep(100);
            System.out.println(num--);
            if(num<=0){
                break;
            }
        }
    }
}
