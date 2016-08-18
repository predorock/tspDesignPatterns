package predo.patterns.state.simple;

/**
 * Created by predo1 on 18/08/16.
 */
public class EndState implements State {
    public void doAction() {
        System.out.println("End State");
    }
}
