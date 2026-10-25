package exam9m;
//父类，员工抽象类
abstract class Employee{
    protected String name;
    public Employee(String name){
        this.name=name;
    }
    //抽象方法，计算薪资
    public abstract double calculateSalary();
    public String getName(){
        return name;
    }
}
//子类，全职员工
class FullTimeEmployee extends Employee{
    private double baseSalary;
    private  double bonus;
    public FullTimeEmployee(String name,double baseSalary,double bonus){
        super(name);
        if(baseSalary<0||bonus<0){
            //非负检验
            throw new IllegalArgumentException("基本工资不能为负数");
        }
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary+bonus;
    }
}
//子类，兼职员工
class PartTimeEmployee extends Employee{
    private double hourlyRate;//时薪
    private double hours;
    public PartTimeEmployee(String name,double hourlyRate,double hours){
        super(name);
        if(hourlyRate<0||hours<0){
            throw new IllegalArgumentException("时薪和工作时长不能为负数");
        }
        this.hourlyRate=hourlyRate;
        this.hours=hours;
    }
    @Override
    public  double calculateSalary(){
        return hourlyRate*hours;
    }
}
//测试类
public class EmployeeTest{
    public static void main(String[] args) {
        //向上转型，多态数组
        Employee[] employees=new Employee[2];
        employees[0]=new FullTimeEmployee("张三",8000,20000);
        employees[1]=new PartTimeEmployee("李四",80,60);
        double totalSalary=0;
        //遍历数组
        for(Employee emp:employees){
            double salary=emp.calculateSalary();
            totalSalary+=salary;
            System.out.printf("员工：%s，月薪：%.2f元%n",emp.getName(),salary);
        }
        System.out.printf("所有员工薪资：%.2f元%n",totalSalary);
    }
}