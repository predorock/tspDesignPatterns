package predo.patterns.abstractFactory.maze.normal;

/**
 * Created by predo1 on 23/08/16.
 */
public class Door extends MapSite {

    private static int _doorCnt = 1;
    private int doorNr;
    private Room room1;
    private Room room2;

    public Door(Room r1, Room r2){
        this.doorNr = _doorCnt++;
        System.out.println("creating a Door #" + this.doorNr + " between " + r1 + " and " + r2);
        this.room1 = r1;
        this.room2 = r2;
    }
    public String toString(){
        return "Door #" + Integer.toString(this.doorNr);
    }

}