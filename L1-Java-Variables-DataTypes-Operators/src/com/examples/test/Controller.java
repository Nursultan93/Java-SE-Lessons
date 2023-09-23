package com.examples.test;

public class Controller {

  private final MainService service;

  public Controller(MainService service) {
    this.service = service;
  }


  public void cap(String text) {
    service.capEt(text);
  }
}
