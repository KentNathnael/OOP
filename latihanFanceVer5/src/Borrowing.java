public abstract class Borrowing {
    IMembership iMembership;
    INotifier iNotifier;
    String name;
    String title;
    int days;

    public Borrowing(IMembership iMembership, INotifier iNotifier, String name, String title, int days) {
        this.iMembership = iMembership;
        this.iNotifier = iNotifier;
        this.name = name;
        this.title = title;
        this.days = days;
    }

    public abstract void processBorrow();
}
