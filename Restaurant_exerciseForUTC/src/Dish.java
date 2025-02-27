public class Dish {
    String name;
    String ID;
    Chef chef;

    public Dish(String name, String ID, Chef chef){
        this.name = name;
        this.ID = ID;
        this.chef = chef;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }

    public Chef getChef(){
        return chef;
    }
}
