package predo.patterns.state.simple;

/**
 * Created by predo1 on 18/08/16.
 */
public class Context implements State {

    private State state;

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public void doAction() {
        this.state.doAction();
    }
}
