package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.bombed.Bomb;
import predo.patterns.abstractFactory.maze.bombed.BombedWall;
import predo.patterns.abstractFactory.maze.bombed.RoomWithABomb;
import predo.patterns.abstractFactory.maze.normal.Room;
import predo.patterns.abstractFactory.maze.normal.Wall;

/**
 * Created by predo1 on 24/08/16.
 */
public class BombedMazeFactory extends MazeFactory{

    private Bomb bomb;

    public BombedMazeFactory(){
        this.bomb = new Bomb(1);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom() {
        return new RoomWithABomb(this.bomb);
    }

    public void setBomb(Bomb bomb){
        this.bomb = bomb;
    }
}
