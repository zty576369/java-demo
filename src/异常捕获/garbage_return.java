package 异常捕获;
//垃圾回收
class Person{
    public void finalize(){//finalize方法会在垃圾回收前被调用
        System.out.println("对象将被作为垃圾回收...");
    }
}

public class garbage_return {
    //演示一个不强制回收垃圾的方法
    public static void recycleWastel(){
        Person p1=new Person();
        p1=null;
        int i=1;
        while(i<10){
            System.out.println("方法1循环中....");
            i++;
        }
    }
    public static void recycleWaaste2(){//演示一个强制回收垃圾的方法
        Person p2=new Person();
        p2=null;
        System.gc();
        int i =1;
        while (i<10){
            System.out.println("方法2循环中...");
            i++;
        }
    }

    public static void main(String[] args) {
        recycleWastel();//分别调用两个方法
        System.out.println("-------------");
        recycleWaaste2();
    }
}
