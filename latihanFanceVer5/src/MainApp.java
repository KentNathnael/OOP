public class MainApp {
    public static void main(String[] args) {
        IMembership membership = new PremiumMembership();
        INotifier notifier = new EmailNotifier("alice@example.com");

        Borrowing borrowing = new BookBorrowing(membership, notifier, "Alice", "Clean Code", 14);
        borrowing.processBorrow();

        IMembership membership2 = new BasicMembership();
        INotifier notifier2 = new SMSNotifier("0812121212");

        Borrowing borrowing2 = new BookBorrowing(membership2, notifier2, "Bob", "The Pragmatic Programmer", 7);
        borrowing2.processBorrow();
    }
}