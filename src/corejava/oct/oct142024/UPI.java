package corejava.oct.oct142024;

public class UPI extends Paymentmethod{
    @Override
    void validatePayment() {
        System.out.println("Validating UPI");
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI");
    }
}
