package mail;

public class EmailNotification extends Notification{

  public void send(String msj){
    System.out.println("EmailNotification: "+msj);
  }
}
