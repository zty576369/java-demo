package heima131;

public class suanfa1 {
    public static void main(String[] args) {
        /*
        * 定义两个字符串，记录为非负整数，求他们的和，输入12395和133，输出12528
        * 注意数据过大，超出int取值范围情况
        * */
        String s1="12395";
        String s2="133";
        //把两个字符串中的数据放到int类型数组里面
        int len=s1.length()<=s2.length()?s1.length():s2.length();
        System.out.println(len);


    }
    //把字符串中的数据放入到int类型的数组中
    public static int[] copData(String s,int len){
        //定义int类型的数组
        int[] arr=new int[len];
        //把字符串中的数据放入到数组中
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }
        return null;
    }
}
