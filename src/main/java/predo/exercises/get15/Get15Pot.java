package predo.exercises.get15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by predo1 on 28/08/16.
 */
public class Get15Pot {

    private List<Integer> numbers;

    public Get15Pot(){
        this.numbers = new ArrayList<Integer>();
        this.numbers.add(1);
        this.numbers.add(2);
        this.numbers.add(3);
        this.numbers.add(4);
        this.numbers.add(5);
        this.numbers.add(6);
        this.numbers.add(7);
        this.numbers.add(8);
        this.numbers.add(9);
    }

    public boolean hasNumber(Integer number) {
        return this.numbers.contains(number);
    }

    public Integer getNumber(Integer number) {
        int i = this.numbers.indexOf(number);
        if(i == -1) throw new IllegalArgumentException();
        else{
            return this.numbers.remove(i);
        }
    }
}
