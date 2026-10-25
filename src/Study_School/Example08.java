package Study_School;
import java.text.DateFormat;
import java.util.Date;

public class Example08 {
    public static void main(String[] args) {
        //创建date对象
        Date date=new Date();
        //FULL格式的日期格式器对象
        DateFormat fullFormat=DateFormat.getDateInstance(DateFormat.FULL);
        //long格式的日期格式器对象
        DateFormat longFormat=DateFormat.getDateInstance(DateFormat.LONG);
        //MEDIUM格式的日期/时间 格式器对象
        DateFormat mediumFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //SHORT格式的日期/时间格式器对象
        DateFormat shortFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println("当前日期的完整格式为："+fullFormat.format(date));
        System.out.println("当前日期的长格式为："+longFormat.format(date));
        System.out.println("当前日期的普通格式为："+mediumFormat.format(date));
        System.out.println("当前日期的短格式为："+shortFormat.format(date));
    }
}
