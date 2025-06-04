public class CardPayment implements IPayment{
    String cardNumber;
    int startIndex;
    String maskNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        startIndex = cardNumber.length()-4;
        this.maskNumber = cardNumber.substring(startIndex);
    }

    @Override
    public boolean pay(double amount){
        System.out.println("Payment of $" + amount + " completed via Card : ****" + maskNumber);
        return true;
    }
}
