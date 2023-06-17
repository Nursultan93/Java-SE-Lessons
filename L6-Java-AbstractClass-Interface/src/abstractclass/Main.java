package abstractclass;


public class Main {

  public static void main(String[] args) {

    Dog d = new Dog();
    Eagle e = new Eagle();
    Tiger t = new Tiger();

    yemekYe(t);
  }

  public static void yemekYe(Animal animal){
    animal.yemek();
    System.out.println("Heyvan yemek yedi ve yuvasina getdi");
  }

}
