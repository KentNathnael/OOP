public abstract class Purchase {
    protected IPayment iPayment;
    protected INotification iNotification;
    protected String customerName;
    protected String productName;
    protected double price;

    public Purchase(IPayment iPayment, INotification iNotification, String customerName, String productName, double price) {
        this.iPayment = iPayment;
        this.iNotification = iNotification;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
    }

    public abstract void checkout();
}
