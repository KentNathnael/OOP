public class Enemy extends Actor {
    public Enemy(String name, HP hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    public void showHP(){
        if(hp.getHP() == 0){
            System.out.println(name + " current HP is 0");
            return;
        }
        System.out.println(name + " current HP is " + hp.getHP());
    }
}
