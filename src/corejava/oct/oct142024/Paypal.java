package corejava.oct.oct142024;

public class Paypal extends Paymentmethod implements Refund{

    @Override
    void validatePayment() {
        System.out.println("Validating paypal");
    }

    @Override
    void processPayment() {
        System.out.println("Processing paypal");

    }


    @Override
    public void issueRefund() {
        System.out.println("Refund issued for paypal");
    }
}
