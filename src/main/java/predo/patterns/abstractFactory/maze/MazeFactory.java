package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.normal.Door;
import predo.patterns.abstractFactory.maze.normal.Maze;
import predo.patterns.abstractFactory.maze.normal.Room;
import predo.patterns.abstractFactory.maze.normal.Wall;

/**
 * Created by predo1 on 23/08/16.
 */
public class MazeFactory implements MazeFactoryInterface {
    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom() {
        return new Room();
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1,room2);
    }
}
