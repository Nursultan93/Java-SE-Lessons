package com.examples.test;

public class Service2 implements MainService{

  private final Repository repository;

  public Service2(Repository repository){
    this.repository = repository;
  }

  @Override
  public void capEt(String text) {
    System.out.println("servie2");
    repository.print(text);
  }
}
