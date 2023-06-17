package abstractclass;

import interfaces.EvQusu;

public class Toyuq extends Animal implements EvQusu {

  @Override
  public void yemek() {

  }

  @Override
  public void gezmek() {

  }

  @Override
  public void yasamaq() {

  }

  @Override
  public void method1() {
    System.out.println("Ev qusudur toyuq");
  }

  @Override
  public void defaultM1() {
    System.out.println("men override olunmus default metodam");
  }
}
