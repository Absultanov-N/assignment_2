package assignment2.abstractfactory;

public class Client {
    private final Button button;
    private final Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUserInterface() {
        button.render();
        checkbox.render();
    }
}
