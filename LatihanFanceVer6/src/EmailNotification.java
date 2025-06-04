public class EmailNotification implements INotification{
    String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void notifyUser(String message){
        System.out.println("Email sent to " + email + ": " + message);
    }
}
