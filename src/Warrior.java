public class Warrior {

    private int health = 100;

    // Нанести удар
    public void beat (Warrior warrior){
        warrior.setHealth(warrior.getHealth() - 20);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
