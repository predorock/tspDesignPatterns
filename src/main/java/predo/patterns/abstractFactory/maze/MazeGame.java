package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.normal.*;

/**
 * Created by predo1 on 23/08/16.
 */
class MazeGame {
    public Maze createMaze(MazeFactoryInterface factory){
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door theDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East,  theDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West,  factory.makeWall());
        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East,  factory.makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West,  theDoor);

        return aMaze;
    }
}