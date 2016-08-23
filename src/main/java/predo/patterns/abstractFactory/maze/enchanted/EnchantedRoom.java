package predo.patterns.abstractFactory.maze.enchanted;

import predo.patterns.abstractFactory.maze.normal.Room;

/**
 * Created by predo1 on 23/08/16.
 */
public class EnchantedRoom extends Room{
    public EnchantedRoom(Spell spell){
        super();
    }
    public String toString(){
        return "enchanted " + super.toString();
    }
}
