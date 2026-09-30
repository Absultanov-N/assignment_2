package assignment2;

import assignment2.abstractfactory.Client;
import assignment2.abstractfactory.GUIFactory;
import assignment2.abstractfactory.MacFactory;
import assignment2.abstractfactory.WindowsFactory;
import assignment2.factorymethod.Logistics;
import assignment2.factorymethod.RoadLogistics;
import assignment2.factorymethod.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        demonstrateFactoryMethod();
        demonstrateAbstractFactory();
    }

    private static void demonstrateFactoryMethod() {
        System.out.println("Factory Method");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }

    private static void demonstrateAbstractFactory() {
        System.out.println("\nAbstract Factory");
        GUIFactory windowsFactory = new WindowsFactory();
        new Client(windowsFactory).renderUserInterface();

        GUIFactory macFactory = new MacFactory();
        new Client(macFactory).renderUserInterface();
    }
}
