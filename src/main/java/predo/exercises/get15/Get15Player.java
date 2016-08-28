package predo.exercises.get15;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by predo1 on 28/08/16.
 */
public class Get15Player {

    private List<Integer> numbers;

    public Get15Player(){
        this.numbers = new ArrayList<Integer>();
    }

    public void drawNumber(int number) {
        this.numbers.add(number);
    }

    public boolean hasWin() {
        if(this.numbers.size() < 3) {
            return false;
        }
        else {
            return this.hasCombinations();
        }
    }

    private boolean hasCombinations(){
        for(int first = 0; first < this.numbers.size(); first++){
            for(int sec = first  + 1; sec < this.numbers.size(); sec++){
                for(int third = sec + 1; third < this.numbers.size(); third++){
                    int sum = this.numbers.get(first) + this.numbers.get(sec) + this.numbers.get(third);
                    if(sum == 15) return true;
                }
            }
        }
        return false;
    }
}
