package predo.patterns.proxy.simple;

/**
 * Created by predo1 on 16/08/16.
 */
public class MyProxy implements Subject {

    private RealSubject realSubject;

    public MyProxy(){
        this.realSubject = new RealSubject();
    }

    public void subjectMethod() {
        System.out.println("Proxy Has processed the request");
        this.realSubject.subjectMethod();
    }
}
