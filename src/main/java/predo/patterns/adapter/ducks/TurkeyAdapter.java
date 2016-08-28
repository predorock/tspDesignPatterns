package predo.patterns.adapter.ducks;

/**
 * Created by predo1 on 27/08/16.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey aTurkey){
        this.turkey = aTurkey;
    }

    public void quack() {
        this.turkey.gobble();
    }

    public void fly() {
        for(int i=0; i<5;i++){
            this.turkey.fly();
        }
    }
}
