public class BookBorrowing extends Borrowing{
    public BookBorrowing(IMembership iMembership, INotifier iNotifier, String name, String title, int days) {
        super(iMembership, iNotifier, name, title, days);
    }

    @Override
    public void processBorrow(){
        System.out.println(name + " borrowed " + title + "for " + days + " days using " + iMembership.getMembershipType());
        String message = name + ", return " + title + "in " + days + " days";
        iNotifier.notifyUser(message);
    }
}
