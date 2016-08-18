package predo.patterns.state.simple;

/**
 * Created by predo1 on 18/08/16.
 */
public class StartState implements State {
    public void doAction() {
        System.out.println("Start state");
    }
}
