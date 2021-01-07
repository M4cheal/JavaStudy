package Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.setName("老虎");
        t.setFood("肉");
        t.eat();
        t.sleep();

        Panda p=new Panda();
        p.setName("熊猫");
        p.setFood("竹子");
        p.eat();
        p.sleep();

        Mouse m=new Mouse();
        m.setName("老鼠");
        m.setFood("垃圾");
        m.eat();
        m.sleep();
    }
}
