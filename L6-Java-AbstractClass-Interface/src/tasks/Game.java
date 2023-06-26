package tasks;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {

        Warrior warrior = new Warrior(10, "Gladius");
        Mage mage = new Mage(15, "Run");

        List<Attackable> array = new ArrayList<>();

        array.add(warrior);
        array.add(mage);

//        public void addCharacter(){
//
//        }
//
//        public void removeCharacter(){
//
//        }
//
//        public void displayCharacters(){
//
//        }
//
//        public void attackCharacter(){
//
//        }
    }


}
