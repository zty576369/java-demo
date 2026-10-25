package demosum;

public class demo1{
    public static void main(String[] args) {
        int num = 20;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }

        String flag = num % 2 == 0 ? num + "是偶数" : num + "是奇数";
        System.out.println(flag);
        System.out.println("----------------");


        int grade=76;
        if(grade>80){
            System.out.println("优");
        }else if(grade>70){
            System.out.println("良");
        }else if(grade>60){
            System.out.println("中");
        }else{
            System.out.println("差");
        }

        int month=5;
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");break;
        }
    }
}