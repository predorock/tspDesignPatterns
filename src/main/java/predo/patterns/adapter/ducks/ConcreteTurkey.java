package predo.patterns.adapter.ducks;

/**
 * Created by predo1 on 27/08/16.
 */
public class ConcreteTurkey implements Turkey {
    public void gobble() {
        System.out.println("GOBBLE GOBBLE !!");
    }

    public void fly() {
        System.out.println("Fly short distance, NOOB !!");
    }
}
