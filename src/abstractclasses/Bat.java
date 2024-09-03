package abstractclasses;

import interfaces.Flyable;

public class Bat extends Animal implements Flyable {


    public void enterBatmobile(){
        System.out.println("Batmobile");
    }

    @Override
    public void eat() {
        System.out.println("Drinking blood... it's a joke bats are very cure and friendly");
    }

    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("taanana tanantata batman and its flying");
    }
}
