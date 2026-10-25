package demosum;

//实现封装 使用private修饰
class Person {
    private String name;
    private int age;
    public String getName(){
        return name;
    }//方法公有化 获取name属性
    public void setName(String name){
        this.name=name;
    }//设置name属性的值
    public int getAge(){
        return age;
    }//设置年龄值
    public  void setAge(int age){ //外部调用方法，传入此参数
        if(age<=0){
            System.out.println("您输入的年龄不正确！");
        }else{
            this.age=age;
        }
    }
    public void speak(){
        System.out.println("我叫"+name+"今年"+age+"岁了");
}
}

