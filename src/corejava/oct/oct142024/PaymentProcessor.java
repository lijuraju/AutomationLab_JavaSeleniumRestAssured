package corejava.oct.oct142024;

public class PaymentProcessor {

    public static void main(String[] args) {

        Paymentmethod cc = new Creditcard();
        Paymentmethod upi = new UPI();
        Paymentmethod paypal = new Paypal();

        cc.logTransaction("Credit card");
        cc.processPayment();
        cc.processPayment();

        upi.logTransaction("UPI");
        upi.processPayment();
        upi.processPayment();

        paypal.logTransaction("Paypal");
        paypal.processPayment();
        paypal.processPayment();
    }
}
