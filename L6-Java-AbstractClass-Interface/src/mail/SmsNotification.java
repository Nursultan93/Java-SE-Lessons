package mail;

public class SmsNotification extends Notification{

  public void send(String msj){
    System.out.println("SmsNotification: "+msj);
  }
}
