package tasks;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Salam", 90, 10, "Gladius");
        Mage mage = new Mage("Faiq", 60, 15, "Run");
        Shooter shooter = new Shooter();

        List<GameCharacter> array = new ArrayList<>();

        array.add(warrior);
        array.add(mage);
        array.add(shooter);

        addCharacter(warrior);
        addCharacter(mage);
        removeCharacter(warrior);

        displayCharacters(array);

    }
    public static void addCharacter(GameCharacter character){
        System.out.println("addCharacter");
        System.out.println(character.getName() +" added");
    }

    public static void removeCharacter(GameCharacter character){
        System.out.println("removeCharacter");
        System.out.println("Removed " + character.getName());
    }

    public static void displayCharacters(List<GameCharacter> list){
        for (GameCharacter a : list){
            System.out.println(a.getName());
        }
    }

    public static void attackCharacter(GameCharacter attacker, GameCharacter target){
        System.out.println("attackCharacter");
        System.out.println(attacker.getName() + " attacked");
        System.out.println(target.getName() + " attacked");
    }


}
