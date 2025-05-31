public abstract class Order {
    IPayment iPayment;
    INotification iNotification;
    String name;
    double price;
    public Order(IPayment iPayment, INotification iNotification, String name, double price){
        this.iPayment = iPayment;
        this.iNotification = iNotification;
        this.name = name;
        this.price = price;
    }

    public abstract void processOrder();
}
