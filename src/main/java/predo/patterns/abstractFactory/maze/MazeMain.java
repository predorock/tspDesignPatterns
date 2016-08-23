package predo.patterns.abstractFactory.maze;

import predo.patterns.abstractFactory.maze.bombed.Bomb;

/**
 * Created by predo1 on 23/08/16.
 */
public class MazeMain {
    public static void main(String[] args) {

        MazeGame game = new MazeGame();
        BombedMazeFactory factory = new BombedMazeFactory();
        factory.setBomb(new Bomb(25));
        game.createMaze(factory);
    }
}
