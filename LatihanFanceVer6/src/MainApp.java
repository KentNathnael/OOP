public class MainApp {
    public static void main(String[] args) {
        IPayment payment = new WalletPayment("alice_wallet");
        INotification notification = new PushNotification("Alice's Phone");

        GamePurchase purchase = new GamePurchase(payment, notification, "Alice", "Cyberpunk 2077", 59.99);
        purchase.checkout();

        IPayment payment2 = new CardPayment("1234-5678-1234-5678");
        INotification notification2 = new EmailNotification("bob@example.com");

        GamePurchase purchase2 = new GamePurchase(payment2, notification2, "Bob", "Minecraft", 26.99);
        purchase2.checkout();
    }

    // Single responsiblity Principle = payment, notif, purchaes dipisah
    // Open/closed principle = payment menyesuaikan bisa di modif tapi tidak dapat dihilangkan
    // liskov Substituoon Principle = game purchaes bisa mengganti purchase tanpa meruskanya
    // interface segregation Principle = 1 interface 1 method
    // dependecy inversion principle = gamepurchase bergantung pada abstract
}
