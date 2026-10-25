package God_Syn;

import java.util.ArrayList;
import java.util.List;
//线程不安全集合，多个线程同时操作集合，会导致数据不一致或异常
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{list.add(Thread.currentThread().getName());}).start();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());
    }
}
