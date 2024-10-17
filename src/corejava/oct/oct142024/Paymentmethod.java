package corejava.oct.oct142024;

abstract  class Paymentmethod {

    abstract void validatePayment();
    abstract void processPayment();

    void logTransaction(String paymentType){
        System.out.println("Payment type: "+paymentType);
    }


}
