package predo.patterns.state.phones;

/**
 * Created by predo1 on 18/08/16.
 */
public class iPhone implements Phone {
    public void call() {
        System.out.println("I am calling the big apple");
    }

    public void sms() {
        System.out.println("Sending a message with iMessage");
    }

    public void mms() {
        System.out.println("Sending multimedia with iMessage");
    }

    public void wap() {
        System.out.println("Connection with WAP ...");
    }

    public void umts() {
        System.out.println("Connection with UMTS ...");
    }

    public void ggg() {
        System.out.println("Connection with 3G ...");
    }

    public void lte() {
        System.out.println("Connection with 4G ...");
    }

    public String takePhoto() {
        return "A photo with a HUGE!! resolution";
    }
}
