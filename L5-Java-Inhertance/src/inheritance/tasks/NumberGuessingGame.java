package inheritance.tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Please insert one number from 1 to 100: ");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        Random ran = new Random();
        int random = ran.nextInt(100);
        System.out.println("Random number is: " + random);

        if (random == userNumber){
            System.out.println("You found the random number! Congratularion!!!");
        }else{
            System.out.println("Please try again!!!");
        }
    }
}
