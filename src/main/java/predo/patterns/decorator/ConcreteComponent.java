package predo.patterns.decorator;

/**
 * Created by predo1 on 22/08/16.
 */
public class ConcreteComponent implements Component {
    public void simpleAction() {
        System.out.println("Simple action !!");
    }

    public void otherAction() {
        System.out.println("Other Action !!");
    }
}
