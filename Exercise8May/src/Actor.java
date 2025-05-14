public class Actor implements IDamageable, IAttack{
    protected String name;
    protected HP hp;
    protected int attack, defense;

    public Actor(String name, HP hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public HP getHp() {
        return hp;
    }

    public void setHp(HP hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateHP(int totalDamage){
        hp.setHealth(hp.getHP() - totalDamage);
    }

    @Override
    public void attack(IDamageable damageable) {
        damageable.takeDamage(attack, ((Enemy) damageable).getDefense());
        System.out.println(name + " attacking  " + ((Enemy) damageable).getName());
        System.out.println(((Enemy) damageable).getName() + " is taking damage for " + attack + " point(s)");
    }

    public int takeDamage (int damage, int defense){
        int totalDamage = 0;
        if (damage > defense){
            totalDamage = damage;
        }
        updateHP(totalDamage);
        return totalDamage;
    }
}
