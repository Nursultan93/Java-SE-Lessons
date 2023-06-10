package exampls.Controls;

import java.util.Scanner;

public class GreatestNumber {
    //Take three numbers from the user and print the greatest number

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();

         //commente aldigin kodu sorus //
//        if (firstNum > secondNum || firstNum > thirdNum){ //false || false
//            System.out.println("The greatest number is: " + firstNum);
//        }
//
//        if (secondNum > firstNum ||secondNum > thirdNum){
//            System.out.println("The greatest number is: " + secondNum);
//        }
//
//        if (thirdNum > firstNum || thirdNum > secondNum)
//            System.out.println("The greatest number is: " + thirdNum);

//        if (firstNum > secondNum){
//            if (firstNum > thirdNum){
//                System.out.println("The greatest number is: " + firstNum);
//            }
//        }if (secondNum > firstNum){
//            if (secondNum > thirdNum){
//                System.out.println("The greatest number is: " + secondNum);
//            }
//        }if (thirdNum > firstNum){
//            if (thirdNum > secondNum){
//                System.out.println("The greatest number is: " + thirdNum);
//            }
//        }
    }
}
