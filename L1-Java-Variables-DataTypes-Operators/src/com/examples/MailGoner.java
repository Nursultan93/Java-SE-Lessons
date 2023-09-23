package com.examples;

public class MailGoner implements Notification{


  @Override
  public void send() {
    System.out.println("Mail gonderildi");
  }
}