/**
 * @ClassName Teacher
 * @Description: 教师类
 * @Author 纪鉴航
 * @Date 2021/1/8
 * @Version V1.0
 **/
public class Teacher {
    public int tNo;
    public String tName;
    public String tSex;
    public int tAge;
    public float tSalary;
    public void setNo(int tNo){ this.tNo = tNo; }
    public void setName(String tName){ this.tName = tName; }
    public void setSex(String tSex){ this.tSex = tSex; }
    public void setAge(int tAge){ this.tAge = tAge; }
    public void setSalary(float tSalary){ this.tSalary = tSalary; }
    public int getNo(){ return tNo; }
    public String getName(){ return tName; }
    public String getSex(){ return tSex; }
    public int getAge(){ return tAge; }
    public float getSalary(){ return tSalary; }
    public void printMsg(){
        System.out.println("工号:" + tNo + "\t姓名:" + tName + "\t性别:" + tSex +"\t年龄:" + tAge + "\t工资:" + tSalary);
    }
    public static void main(String args[]){
        int max, min;
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        t1.setNo(001);
        t1.setName("张三");
        t1.setSex("男");
        t1.setAge(18);
        t1.setSalary(6000);

        t2.setNo(002);
        t2.setName("李四");
        t2.setSex("男");
        t2.setAge(19);
        t2.setSalary(5000);

        t3.setNo(003);
        t3.setName("王五");
        t3.setSex("女");
        t3.setAge(20);
        t3.setSalary(7000);
        t1.printMsg();
        t2.printMsg();
        t3.printMsg();
        System.out.println("工资最大值：" + Max(Max(t1.getSalary(), t2.getSalary()), t3.getSalary()));
        System.out.println("工资最小值：" + Min(Min(t1.getSalary(), t2.getSalary()), t3.getSalary()));
    }
    public static float Max(float a, float b){
        if (a>b) return a;
        return b;
    }
    public static float Min(float a, float b){
        if (a>b) return b;
        return a;
    }
}
