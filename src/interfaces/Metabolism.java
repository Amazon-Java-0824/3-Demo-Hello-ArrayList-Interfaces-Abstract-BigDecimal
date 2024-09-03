package interfaces;

public class Metabolism implements Activable{
    @Override
    public int activate() {
        System.out.println("Good you are an active person");
        return 0;
    }
}
