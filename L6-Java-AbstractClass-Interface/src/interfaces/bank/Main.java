package interfaces.bank;

public class Main {
  public static void main(String[] args) {
    Bank b = new NBCBank();
    System.out.println(b.rateOfInterest());
  }
}
