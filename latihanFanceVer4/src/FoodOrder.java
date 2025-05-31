public class FoodOrder extends Order{
    public FoodOrder(IPayment iPayment, INotification iNotification, String name, double price){
        super(iPayment, iNotification, name, price);
    }

    @Override
    public void processOrder(){
        iPayment.pay(price);
        String message = "Dear " + name + " your order of $" + price + " has been placed.";
        iNotification.notifyUser(message);
    }
}
