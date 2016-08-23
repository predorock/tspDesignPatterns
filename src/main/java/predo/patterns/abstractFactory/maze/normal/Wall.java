package predo.patterns.abstractFactory.maze.normal;

/**
 * Created by predo1 on 23/08/16.
 */
public class Wall extends MapSite {

    private int _wallNr;
    private static int _wallCnt = 1;

    public Wall(){
        _wallNr = _wallCnt++;
        System.out.println("creating Wall #" + Integer.toString(_wallNr));
    }

    public String toString(){ return "Wall #" + Integer.toString(_wallNr); }
}
