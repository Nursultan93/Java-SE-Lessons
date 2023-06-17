package interfaces;

public interface C extends A, B{

  public static String a = "";

  void c();
  void b();

  default void a(){
    System.out.println("a");
  }

  default void a(int d){
    System.out.println("a");
  }

  static void s(){
    System.out.println("c static");
  }

  static void s(int l){
    System.out.println("c static");
  }
}
