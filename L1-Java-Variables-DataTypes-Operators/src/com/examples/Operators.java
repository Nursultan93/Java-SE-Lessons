package com.examples;

public class Operators {

  public static void main(String[] args) {

    //Unary
    //value++ and ++value - postfix
    //value-- and --value - prefix

    int a = 10;

    System.out.println(++a + ++a - --a);

    boolean bo = false;

    System.out.println(!bo);

    //Arithmetic
    //+, -, *, /, %

    int a1 = 16;
    int a2 = 5;

    System.out.println(a1+a2);
    System.out.println(a1-a2);
    System.out.println(a1*a2);
    System.out.println(a1/a2);
    System.out.println(a1%a2);

    //Left & Right Shift
    //<< , >>

    System.out.println(10<<2);// 10*2^2 = 10*4 = 40
    System.out.println(10>>2);// 10*2^2 = 10/4 = 2


    //Logical
    // &, |, &&, ||

    int a3 = 10;
    int a4 = 6;
    int a5 = 7;

    if (a3>a4 & a4<a5) { //false & true  -> false
      System.out.println("Salam");
    }

    if (a3<a4 && a4++<a5) { // false
      System.out.println("Test");
    }

    System.out.println(a4);


    //Ternary
    // (condition) ? case1 : case2

    int d = 34;
    int n = 89;

    int m = d<n ? 90 : 40;

    System.out.println(m);

    //Assignment

    int y = 10;
    //y = y +5;
    y+=4;

    System.out.println(y);

    int x = 40;
    //x = x * 10;
    x*=10;
    System.out.println(x);

    int l = 20;
    int e = 10;
    //l+=e;
    l = l + e;

    System.out.println(l);

  }
}
