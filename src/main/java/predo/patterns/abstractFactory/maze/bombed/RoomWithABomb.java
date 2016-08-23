package predo.patterns.abstractFactory.maze.bombed;

import predo.patterns.abstractFactory.maze.normal.Room;

/**
 * Created by predo1 on 24/08/16.
 */
public class RoomWithABomb extends Room {

    private Bomb bomb;

    public RoomWithABomb(Bomb bomb){
        this.bomb = bomb;
    }

    public Bomb getBomb() {
        return bomb;
    }

    @Override
    public String toString() {
        return "bombed (power " + this.bomb.getPower() +") " + super.toString();
    }
}
