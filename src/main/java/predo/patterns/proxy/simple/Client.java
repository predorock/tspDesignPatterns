package predo.patterns.proxy.simple;

/**
 * Created by predo1 on 16/08/16.
 */
public class Client {

    private Subject subject;

    public static void main(String[] args) {
        new Client().invoke();
    }

    public void invoke(){
        subject = new MyProxy();
        subject.subjectMethod();
    }
}
