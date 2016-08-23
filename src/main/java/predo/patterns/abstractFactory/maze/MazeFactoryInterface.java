package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.normal.Door;
import predo.patterns.abstractFactory.maze.normal.Maze;
import predo.patterns.abstractFactory.maze.normal.Room;
import predo.patterns.abstractFactory.maze.normal.Wall;

/**
 * Created by predo1 on 23/08/16.
 */
public interface MazeFactoryInterface {
    public Maze makeMaze();
    public Wall makeWall();
    public Room makeRoom();
    public Door makeDoor(Room room1, Room room2);
}
