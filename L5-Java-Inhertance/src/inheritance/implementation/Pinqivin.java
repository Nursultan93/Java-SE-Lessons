package inheritance.implementation;

public class Pinqivin extends Animal implements SudaYasanalar, QurudaYasananlar{


  @Override
  public void yemekYe() {
    System.out.println("Men quruda olan yemeklerde yeye bilirem");
  }

  @Override
  public void baliqYe() {
    System.out.println("Men baliqlada qidalaniram");
  }
}
