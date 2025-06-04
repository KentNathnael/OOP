public class WalletPayment implements IPayment{
    String id;

    public WalletPayment(String id) {
        this.id = id;
    }

    @Override
    public boolean pay(double amount){
        System.out.println("Payment of $" + amount + " completed via Wallet : " + id);
        return true;
    }
}
