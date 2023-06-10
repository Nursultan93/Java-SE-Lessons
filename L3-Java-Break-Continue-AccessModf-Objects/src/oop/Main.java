package oop;


public class Main {
  public static void main(String[] args) {


    Animal a1 = new Animal();
    a1.setName("Bird");

    Animal a2 = new Animal();
    a2.setName("Cat");

    System.out.println(a1);
    System.out.println(a2);

    boolean isAnimal = a1.equals(a2);

    System.out.println(isAnimal);

  }
}
