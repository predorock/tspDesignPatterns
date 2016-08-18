package predo.patterns.state.phones;

/**
 * Created by predo1 on 18/08/16.
 */
public class Nokia3310 implements Phone{
    public void call() {
        System.out.println("Whoa i am calling your friend");
    }

    public void sms() {
        System.out.println("bzz bzz I am sending the message");
    }

    public void mms() {}

    public void wap()  {}

    public void umts() {}

    public void ggg()  {}

    public void lte()  {}

    public String takePhoto() {return null;}


}
