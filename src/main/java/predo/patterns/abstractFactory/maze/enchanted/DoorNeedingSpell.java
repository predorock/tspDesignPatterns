package predo.patterns.abstractFactory.maze.enchanted;

import predo.patterns.abstractFactory.maze.normal.Door;
import predo.patterns.abstractFactory.maze.normal.Room;

/**
 * Created by predo1 on 23/08/16.
 */
public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
    }
    public String toString(){
        return super.toString() + " (needing spell)";
    }
}
