public class PushNotification implements INotification{
    String name;

    public PushNotification(String name) {
        this.name = name;
    }

    @Override
    public void notifyUser(String message){
        System.out.println("Push Notification to " + name + ": " + message);
    }
}
