package predo.patterns.abstractFactory.maze.bombed;

import predo.patterns.abstractFactory.maze.normal.Wall;

/**
 * Created by predo1 on 24/08/16.
 */
public class BombedWall extends Wall {

    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "bombed " + super.toString();
    }
}
