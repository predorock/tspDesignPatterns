package predo.patterns.decorator;

/**
 * Created by predo1 on 22/08/16.
 */
public class ConcreteComponentDecorator implements ComponentDecorator {

    private Component component;

    public ConcreteComponentDecorator(Component component){
        this.component = component;
    }

    public void simpleAction() {
        long startTime = System.currentTimeMillis();
        this.component.simpleAction();
        long endTime = System.currentTimeMillis();
        System.out.println("Method execution : " + (endTime-startTime) + "mills");
    }

    public void otherAction() {
        long startTime = System.currentTimeMillis();
        this.component.otherAction();
        long endTime = System.currentTimeMillis();
        System.out.println("Method execution : " + (endTime-startTime) + "mills");
    }

}
