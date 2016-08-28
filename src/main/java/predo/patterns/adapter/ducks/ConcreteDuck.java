package predo.patterns.adapter.ducks;

/**
 * Created by predo1 on 27/08/16.
 */
public class ConcreteDuck implements Duck {
    public void quack() {
        System.out.println("QUACK !!");
    }

    public void fly() {
        System.out.println("I believe I can fly !!!!!");
    }
}
