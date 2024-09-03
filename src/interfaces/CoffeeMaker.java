package interfaces;

public class CoffeeMaker implements Activable, Flyable{

    private String name;
    private Double price;
    private Double servingCapacity;

    @Override
    public int activate() {
        System.out.println("interfaces.CoffeeMaker activated: " + name);
        return 0;
    }

    public CoffeeMaker(String name, Double price, Double servingCapacity) {
        this.name = name;
        this.price = price;
        this.servingCapacity = servingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getServingCapacity() {
        return servingCapacity;
    }

    public void setServingCapacity(Double servingCapacity) {
        this.servingCapacity = servingCapacity;
    }

    @Override
    public void fly() {
        System.out.println("That is a very strong coffee.. I'm flying");
    }
}
