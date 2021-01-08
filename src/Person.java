/**
 * @ClassName Person
 * @Description: TODO
 * @Author M4chael
 * @Date 2021/1/8
 * @Version V1.0
 **/
public class Person {
    public String name;
    public String sex;
    public int age;
    public String nationality;
    public void Eat() { System.out.println(name + "吃饭"); }
    public void Sleep() { System.out.println(name + "睡觉"); }
    public void Work() { System.out.println(name + "工作"); }
    public void PrintMsg() { System.out.format("姓名:%s,年龄:%d,性别:%s,国籍:%s\t" , name, age, sex, nationality); }
    public static void main(String[] args) {
        Student s = new Student();
        Workman w = new Workman();
        stuLeader sL = new stuLeader();
        s.name = "张三";
        s.age = 18;
        s.sex = "男";
        s.nationality = "中国";
        s.school = "沈阳工学院";
        s.no = 1731030232;
        s.PrintMsg();
        s.Work();

        w.name = "王五";
        w.age = 26;
        w.sex = "女";
        w.nationality = "中国";
        w.workSpace = "东软";
        w.workAge = 3;
        w.PrintMsg();
        w.Work();

        sL.name = "李四";
        sL.age = 21;
        sL.sex = "男";
        sL.nationality = "中国";
        sL.school = "沈阳工学院";
        sL.no = 1731030001;
        sL.job = "班长";
        sL.PrintMsg();
        sL.Work();
        sL.Meeting();

    }
}
class Student extends Person{
    public String school;
    public int no;
    public void Work() { System.out.println(name + "的工作是学习"); }
    public void PrintMsg() { System.out.format("姓名:%s,年龄:%d,性别:%s,国籍:%s,学校:%s,学号:%d\t" , name, age, sex, nationality, school, no); }
}
class Workman extends Person{
    public String workSpace;
    public int workAge;
    public void Work() { System.out.println(name + "的工作是上班"); }
    public void PrintMsg() { System.out.format("姓名:%s,年龄:%d,性别:%s,国籍:%s,单位:%s,工龄:%d\t" , name, age, sex, nationality, workSpace, workAge); }

}
class stuLeader extends Student{
    public String job;
    public void Meeting() { System.out.print(name + "开会中。。。"); }
    public void PrintMsg() { System.out.format("姓名:%s,年龄:%d,性别:%s,国籍:%s,学校:%s,学号:%d,职务:%s\t" , name, age, sex, nationality, school, no, job); }

}