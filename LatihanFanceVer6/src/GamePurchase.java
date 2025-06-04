public class GamePurchase extends Purchase{
    public GamePurchase(IPayment iPayment, INotification iNotification, String customerName, String productName, double price) {
        super(iPayment, iNotification, customerName, productName, price);
    }

    @Override
    public void checkout(){
        if(iPayment.pay(price)){
            String message = customerName + ", you purchased " + productName + " for $" + price;
            iNotification.notifyUser(message);
        }
        else{
            System.out.println("Payment not succesfully done");
        }
    }
}
