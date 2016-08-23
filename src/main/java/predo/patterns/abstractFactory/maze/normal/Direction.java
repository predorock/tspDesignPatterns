package predo.patterns.abstractFactory.maze.normal;

/**
 * Created by predo1 on 23/08/16.
 */
public final class Direction {

    private String directionName;

    private Direction(String directionName){
        this.directionName = directionName;
    }

    public final static Direction North = new Direction("North");
    public final static Direction South = new Direction("South");
    public final static Direction East = new Direction("East");
    public final static Direction West = new Direction("West");

    public String toString(){
        return this.directionName;
    }
}
