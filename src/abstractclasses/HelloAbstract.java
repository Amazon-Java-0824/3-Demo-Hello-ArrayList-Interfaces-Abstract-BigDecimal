package abstractclasses;

import interfaces.Flyable;

public class HelloAbstract {

    public static void main(String[] args) {

//        Animal animal = new Animal("Dan", 0);

        Animal humanAnimal = new Human("Gojo", 32);

        Animal bat = new Bat("John", 4);

        ((Bat)bat).enterBatmobile();

        humanAnimal.eat();

    }
}
