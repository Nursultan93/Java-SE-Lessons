package com.examples;

public class BildirisGonder implements Notification{


  @Override
  public void send() {
    System.out.println("Bildiris gonderildi");
  }

}
