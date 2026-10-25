package Study_School;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example09 {
    public static void main(String[] args) throws ParseException {
        DateFormat dt1=DateFormat.getDateInstance();
        DateFormat dt2=DateFormat.getDateInstance(DateFormat.LONG);
        String s1="2018-01-27";
        String s2="2018年01月27日";
        //输出对应格式的字符串解析成date对象后的结果
        System.out.println(dt1.parse(s1));
        System.out.println(dt2.parse(s2));

        SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年mm月dd日：今天是yyyy年的第d天，e");
        System.out.println(sdf.format(new Date()));
    }
}
