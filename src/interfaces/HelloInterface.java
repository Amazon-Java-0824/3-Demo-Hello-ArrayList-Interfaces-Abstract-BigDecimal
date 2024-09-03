package interfaces;

public class HelloInterface {
    public static void main(String[] args) {

        Fridge fridge = new Fridge("White");
        CoffeeMaker coffeeMaker = new CoffeeMaker("AeroPress", 30.00, 0.250);
        Metabolism metabolism = new Metabolism();

        activateObject(fridge);
        activateObject(coffeeMaker);
        activateObject(metabolism);



    }

    static void activateObject(Activable activable){
        activable.activate();
    }
}
