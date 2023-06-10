package exampls.Controls;

import java.util.Scanner;

public class MarksOfSubjects {
    //Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
    // Calculate percentage and grade according to following:
    //Percentage >= 90% : Grade A
    //Percentage >= 80% : Grade B
    //Percentage >= 70% : Grade C
    //Percentage >= 60% : Grade D
    //Percentage >= 40% : Grade E
    //Percentage < 40% : Grade F

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark you got from Physics: ");
        double physics = sc.nextDouble();
        System.out.println("Enter the mark you got from Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.println("Enter the mark you got from Biology: ");
        double biology = sc.nextDouble();
        System.out.println("Enter the mark you got from Mathematics: ");
        double mathematics = sc.nextDouble();
        System.out.println("Enter the mark you got from Computer: ");
        double computer = sc.nextDouble();

        double percentage = (physics + chemistry + biology + mathematics + computer) / 5;
        System.out.println("Your percentage is: " + percentage);

        if (percentage >= 90){
            System.out.println("Grade A");
        }else if (percentage >= 80){
            System.out.println("Grade B");
        }else if (percentage >=70){
            System.out.println("Grade C");
        }else if (percentage >= 60){
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        }else
            System.out.println("Grade F");
    }
}
