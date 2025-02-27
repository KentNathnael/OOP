import java.util.ArrayList;
import java.util.List;

public class Customer {
    public List<Dish> orders = new ArrayList<>();
    public String name;
    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void placeOrder(Dish dish){
        orders.add(dish);
    }

    public void displayOrders(){
        System.out.println(name + "'s Orders:");
        for(Dish dish : orders){
            System.out.println("Dish: " + dish.getName());
            System.out.println("ID: " + dish.getID());
            System.out.println("Chef: " + dish.getChef().getName());
            System.out.println("Bio: " + dish.getChef().getBio());
            System.out.println("=============================");
        }
    }

    public void cancelOrders(Dish dish){
        orders.remove(dish);
    }
}
