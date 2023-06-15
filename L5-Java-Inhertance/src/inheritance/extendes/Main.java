package inheritance.extendes;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    BMW b = new BMW();

    b.setSport(true);
    b.setWheelCount(4);
    b.setMaxSpeed(250);
    b.setModel("525");
    b.setCreatedYear("2008");

    Opel o = new Opel();
    o.setVan(false);
    o.setWheelCount(4);
    o.setModel("Astra");
    o.setMaxSpeed(180);
    o.setCreatedYear("2001");


    Bicycle bc = new Bicycle();
    bc.setModel("BC XXX");
    bc.setMaxSpeed(30);
    bc.setWheelCount(2);


    List<Vehicle> list = new ArrayList<>();
    list.add(b);
    list.add(o);
    list.add(bc);

    Vehicle v = new Opel();
    v.setMaxSpeed(300);
    System.out.println(v.getMaxSpeed());


    for (Vehicle vehicle : list){
      System.out.println(vehicle.getMaxSpeed());
    }


  }
}
