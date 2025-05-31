public class EmailNotification implements INotification{
    String adress;
    public  EmailNotification(String adress){
        this.adress = adress;
    }

    @Override
    public void notifyUser(String message){
        System.out.println("Email sent to " + adress + ": "+ message);
    }
}
