package com.examples;

public class SmsGonder implements Notification{


  @Override
  public void send() {
    System.out.println("SMS gonderildi");
  }
}