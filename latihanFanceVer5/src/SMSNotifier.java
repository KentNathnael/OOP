public class SMSNotifier implements INotifier{
    String number;

    public SMSNotifier(String number) {
        this.number = number;
    }

    @Override
    public void notifyUser(String message){
        System.out.println("SMS sent to " + number + ": " + message);
    }
}
