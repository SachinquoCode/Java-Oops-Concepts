public class Polymorphism {
    public static void main(String[] args) {
        // Here the runtime polymorphism fundamental is not applied,
        // as it is of single CashPayment form
        CashPayment c = new CashPayment();
        c.pay();
        // Now the initialization is done using runtime polymorphism and
        // it can have many forms at runtime
        // Single payment "p" instance can be used to pay by cash and credit card
        Payment p = new CashPayment();
        p.pay();
        // Pay by cash
        p = new CreditPayment();
        p.pay();
        // Pay by creditcard
    }
}