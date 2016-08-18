package predo.patterns.state.phones;

/**
 * Created by predo1 on 18/08/16.
 */
public class Employee implements Phone{

    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void call() {
        this.phone.call();
    }

    public void sms() {
        this.phone.sms();
    }

    public void mms() {
        this.phone.mms();
    }

    public void wap() {
        this.phone.wap();
    }

    public void umts() {
        this.phone.umts();
    }

    public void ggg() {
        this.phone.ggg();
    }

    public void lte() {
        this.phone.lte();
    }

    public String takePhoto() {
        return this.phone.takePhoto();
    }
}
