public class SMSNotification implements INotification{
    String number;
    public SMSNotification(String number){
        this.number = number;
    }

    @Override
    public void notifyUser(String message){
            System.out.println("SMS sent to " + number + ": "+ message);
    }
}
