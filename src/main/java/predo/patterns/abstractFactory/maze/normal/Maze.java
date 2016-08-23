package predo.patterns.abstractFactory.maze.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by predo1 on 23/08/16.
 */
public class Maze {

    private Set rooms;

    public Maze(){
        this.rooms = new HashSet();
        System.out.println("Creating a Maze");
    }

    public void addRoom(Room room){
        if(!this.rooms.contains(room)){
            this.rooms.add(room);
        }
    }
}
