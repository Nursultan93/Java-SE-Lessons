package exampls.Controls;

import java.util.Scanner;

public class SalaryRange {
    //Write a program to calculate the salary as per the following table
    //Gender	Year of Service	     Qualifications	   Salary
    //Male	    >= 10	             Post - Graduate	15000
    //          >= 10	             Graduate	        10000
    //          < 10	             Post - Graduate	8000
    //          < 10	             Graduate	        7000

    //Female	>= 10	             Post - Graduate	12000
    //          >= 10	             Graduate	        9000
    //          < 10	             Post - Graduate	6000
    //          < 10	             Graduate	        5000

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the gender: ");
        String gender = sc.nextLine();
        System.out.println("What is your qualifications - Post Graduate or Graduate? ");
        String qualification = sc.nextLine();
        System.out.println("Please specify the year of the service: ");
        int year = sc.nextInt();

        int salary =0;


        if (gender.equals("Male")){
            if (year >= 10){
                if (qualification == "Post Graduate"){
                    salary = 15000;
                }if (qualification == "Graduate"){
                    salary = 10000;
                }
            }if(year <10){
                if (qualification == "Post Graduate"){
                    salary = 8000;
                }if (qualification == "Graduate") {
                    salary = 7000;
                }
            }
        }
        if (gender.equals("Female")){
            if (year >= 10){
                if (qualification == "Post Graduate"){
                    salary = 12000;
                }if (qualification == "Graduate"){
                    salary = 9000;
                }
            }if (year <10){
                if (qualification == "Post Graduate"){
                    salary = 6000;
                }if (qualification == "Graduate") {
                    salary = 5000;
                }
            }
        }
        System.out.println(salary);

    }
}
