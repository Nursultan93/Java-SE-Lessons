package com.examples.test;

public class Main {
  public static void main(String[] args) {
    Controller controller = new Controller(new Service2(new Repository()));
    controller.cap("salam");
  }
}
