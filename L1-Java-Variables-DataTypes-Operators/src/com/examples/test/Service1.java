package com.examples.test;

public class Service1 implements MainService{

  private final Repository repository;

  public Service1(Repository repository){
    this.repository = repository;
  }

  @Override
  public void capEt(String text) {
    System.out.println("servie1");
    repository.print(text);
  }

}
