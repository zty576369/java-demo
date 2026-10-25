package exam9m;

public class StudentTest {
    public static void main(String[] args) {
        // 创建学生对象
        Student stu = new Student(1, "zhang", 80);
        System.out.println("学号：" + stu.getId());
        System.out.println("姓名：" + stu.getName());
        System.out.println("成绩：" + stu.getScore());
        System.out.println("等级：" + stu.getLevel());
        System.out.println("\n演示非法输入");
        //stu.setScore(120);
        Student stu1 = new Student(2, "wang", 200);
        System.out.println("学号：" + stu.getId());
        System.out.println("姓名：" + stu.getName());
        System.out.println("成绩：" + stu.getScore());
        System.out.println("等级：" + stu.getLevel());
    }
}
