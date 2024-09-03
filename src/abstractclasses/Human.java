package abstractclasses;

public class Human extends Animal{
    @Override
    public void eat() {
        System.out.println("Eating with some sticks");
    }

    public Human(String name, int age) {
        super(name, age);
    }
}
