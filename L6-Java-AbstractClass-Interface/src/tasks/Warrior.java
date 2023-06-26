package tasks;

public class Warrior extends GameCharacter implements Attackable{
    private int strength;
    private String weapon;

//    public Warrior(int strength, String weapon) {
//        this.strength = strength;
//        this.weapon = weapon;
//    }

    public Warrior(String name, int health, int strength, String weapon) {
        super(name, health);
        this.strength = strength;
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public void attack(GameCharacter target) {

    }
}
