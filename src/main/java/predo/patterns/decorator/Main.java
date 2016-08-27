package predo.patterns.decorator;

/**
 * Created by predo1 on 22/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ComponentDecorator decorator = new ConcreteComponentDecorator(component);

        component.simpleAction();
        component.otherAction();

        decorator.simpleAction();
        decorator.otherAction();
    }
}
