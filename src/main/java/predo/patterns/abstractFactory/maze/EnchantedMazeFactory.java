package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.enchanted.DoorNeedingSpell;
import predo.patterns.abstractFactory.maze.enchanted.EnchantedRoom;
import predo.patterns.abstractFactory.maze.enchanted.Spell;
import predo.patterns.abstractFactory.maze.normal.Door;
import predo.patterns.abstractFactory.maze.normal.Room;

/**
 * Created by predo1 on 23/08/16.
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(){
        return new EnchantedRoom(castSpell());
    }

    @Override
    public Door makeDoor(Room room1, Room room2){
        return new DoorNeedingSpell(room1,room2);
    }

    protected static Spell castSpell(){
        return new Spell();
    }
}
