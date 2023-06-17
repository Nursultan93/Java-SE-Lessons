package inheritance.tasks;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        System.out.println("Add name: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arry = new String[s.length()];
        arry = s.split("");
        for (int i = 0; i<s.length(); System.out.print(arry[s.length()-i])){
            i++;
        }
    }
}
