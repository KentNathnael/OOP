public class EmailNotifier implements INotifier{
    String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notifyUser(String message){
        System.out.println("Email sent to " + email + ": " + message);
    }
}
