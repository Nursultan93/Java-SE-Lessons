package interfaces;


public interface EvQusu {

  void method1();

  default void defaultM1() {
    System.out.println("Men interfacede deafult metodam");
  }

}
