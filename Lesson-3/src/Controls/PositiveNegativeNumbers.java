package Controls;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    //Write a Java program to test a number is positive or negative

    public static void main(String[] args) {
        System.out.println("Please insert number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >0){
            System.out.println("Number is positive");
        }else
            System.out.println("Number is negative");

    }
}
