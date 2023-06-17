package inheritance.tasks;

import java.util.Scanner;

public class CreatingACalculator {
    public static void main(String[] args) {
        System.out.println("Please insert 2 number: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.println("Please specify what operation should be done: \n for addition please insert + ,substraction - ,  multiplication * and division / ");

        char ch = sc.next().charAt(0);

        if(ch == '+'){
            System.out.println(num1 + num2);
        }else if (ch == '-'){
            System.out.println(num1 - num2);
        }else if(ch == '*'){
            System.out.println(num1 * num2);
        }else if(ch == '/'){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Incorrect operator!");
        }
    }
}
