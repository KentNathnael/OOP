public class MainApp {
    public static void main(String[] args) {
        IPayment payment1 = new CreditCardPayment("1234-5678-9012-3456", "123");
        INotification notification1 = new EmailNotification("john@example.com");

        Order order1 = new FoodOrder(payment1, notification1, "John", 150.00);
        order1.processOrder();

        IPayment payment2 = new CashOnDelivery();
        INotification notification2 = new SMSNotification("08123456789");

        Order order2 = new FoodOrder(payment2, notification2, "Alice", 75.00);
        order2.processOrder();
    }
}
