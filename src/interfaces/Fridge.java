package interfaces;

public class Fridge implements Activable{
    private String color;


    public Fridge(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int activate() {
        System.out.println("interfaces.Fridge is turning on and now active");
        return 0;
    }
}
