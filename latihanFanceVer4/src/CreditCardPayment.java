public class CreditCardPayment implements IPayment{
    String creditCardNumber;
    String CVV;
    String endingNumber;

    public CreditCardPayment(String creditCardNumber, String CVV){
        this.creditCardNumber = creditCardNumber;
        this.CVV = CVV;
        int starting_index = creditCardNumber.length() - 4 ;
        this.endingNumber = creditCardNumber.substring(starting_index);
    }

    @Override
    public boolean pay(double amount){
        System.out.println("Payment of $" + amount + " made using Credit Card ending in " + endingNumber);
        return true;
    }
}
