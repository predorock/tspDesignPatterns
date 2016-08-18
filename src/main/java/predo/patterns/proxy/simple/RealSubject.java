package predo.patterns.proxy.simple;

/**
 * Created by predo1 on 16/08/16.
 */
public class RealSubject implements Subject {
    public void subjectMethod() {
        System.out.println("Real subject method");
    }
}
