package tasks;

public class Mage extends GameCharacter implements Attackable{
    private int intelligence;
    private String spell;

    public Mage(int intelligence, String spell) {
        this.intelligence = intelligence;
        this.spell = spell;
    }

//    public Mage(String name, int health, int intelligence, String spell) {
//        super(name, health);
//        this.intelligence = intelligence;
//        this.spell = spell;
//    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }


    @Override
    public void attack(GameCharacter target) {

    }
}
