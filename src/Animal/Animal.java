package Animal;

public class Animal {
    public String name;
    public String food;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void eat()
    {
    }
    public void sleep()
    {
        System.out.println(getName() + "睡觉");
    }
}
