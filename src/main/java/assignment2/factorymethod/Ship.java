package assignment2.factorymethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivers cargo by sea.");
    }
}
