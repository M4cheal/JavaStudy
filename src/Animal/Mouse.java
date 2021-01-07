package Animal;

public class Mouse extends Animal{
    public void eat()
    {
        System.out.println(getName()+"偷着吃" + getFood());
    }
}
