package com.examples;

import java.security.PublicKey;

public class MessageFactory {

  private final Notification notification;

  public MessageFactory (Notification notification) {
    this.notification = notification;
  }


//  public void setNotification(Notification notification) {
//    this.notification = notification;
//  }

  public void sendMessage() {
    notification.send();
  }

}
