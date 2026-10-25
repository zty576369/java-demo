package demosum;

public class demo4 {
    public static void main(String[] args) {
//        int[] arr =new int[4];
//        System.out.println("arr[4]"+arr[3]);
//
//        int arr[]=new int[3];
//        arr[0]=5;
//        System.out.println("arr[0]"+arr[0]);
//        arr=null; //建议删除
//        System.out.println("arr[0]"+arr[0]);


//        int[] arr={1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//        int[] arr={4,1,6,3,9,8};
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("数组中arr最大值为："+max);

        int[][] arr=new int[3][];
        arr[0]=new int[] {11,12};
        arr[1]=new int[] {21,22,23};
        arr[2]=new int[]{31,32,33,34};
        int sum=0;
        for(int i=0;i<arr[i].length;i++){
            int groupsum=0;
            for(int j=0;j<arr[i].length;j++){
            groupsum+=arr[i][j];
        }
            sum+=groupsum;
            System.out.println("第"+(i+1)+"小组的销售额为："+groupsum+"万元");}
    }
}
