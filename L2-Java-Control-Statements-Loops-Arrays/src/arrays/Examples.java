package arrays;

import java.util.Scanner;

public class Examples {

  public static void main(String[] args) {


    int [][] dubleMassiv = new int[3][3];
    dubleMassiv[0][0] = 9;
    dubleMassiv[0][1] = 3;
    dubleMassiv[0][2] = 2;

    dubleMassiv[1][0] = 0;
    dubleMassiv[1][1] = 5;
    dubleMassiv[1][2] = 8;


    System.out.println(dubleMassiv[1][1]);


    int [] massiv = new int[3];

    System.out.println("3 deyer daxil edin:");

    Scanner sc = new Scanner(System.in);

    System.out.print("1-ci deyer: ");
    massiv[0] = sc.nextInt();
    System.out.println();

    System.out.print("2-ci deyer: ");
    massiv[1] = sc.nextInt();
    System.out.println();

    System.out.print("3-ci deyer: ");
    massiv[2] = sc.nextInt();
    System.out.println();

    System.out.println("Daxil edilen deyerler");
    System.out.println(massiv[0]);
    System.out.println(massiv[1]);
    System.out.println(massiv[2]);


    long array2 [] = new long[]{2, 1, 6, 4, 8};

    System.out.println(array2[10]);


    int [] array = new int[5];
    array[0] = 9;
    array[1] = 4;
    array[2] = -2;
    array[3] = 5;
    array[4] = 8;
    array[5] = 3;

    System.out.println(array[3]);

    System.out.println(array[1]);

    System.out.println(array[5]);

  }
}
