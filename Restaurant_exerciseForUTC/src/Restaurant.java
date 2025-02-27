import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public List<Dish> menu = new ArrayList<>();

    public void addDish(Dish dish){
        menu.add(dish);
        System.out.println("Dish added to menu: " + dish.getName());
    }

    public void placeOrder(Customer customer, Dish dish){
        customer.placeOrder(dish);
        menu.remove(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getName());
    }

    public void cancelOrder(Customer customer, Dish dish){
        menu.add(dish);
        customer.cancelOrders(dish);
        System.out.println(customer.getName()+" canceled order: "+dish.getName());
    }

    public void displayMenu(){
        System.out.println("Menu in Restaurant");
        for(Dish dish : menu){
            System.out.println("Dish: " + dish.getName());
            System.out.println("ID: " + dish.getID());
            System.out.println("Chef: " + dish.getChef().getName());
            System.out.println("Bio: " + dish.getChef().getBio());
            System.out.println("=============================");
        }
    }
}
