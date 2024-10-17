package corejava.oct.oct142024;

public class Creditcard extends Paymentmethod implements Refund{
    @Override
    void validatePayment() {
        System.out.println("Validating credit card");
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card");

    }

    @Override
    public void issueRefund() {
        System.out.println("Refund issued for credit card");
    }
}
