package paypal;

public class Main {
    public static void main(String[] args) {
        PayPalGateway paymentProcessor = new PaymentProcessor();
        Account account = new Account("1");
        paymentProcessor.processPayment(account,100.0, 101);
    }
}