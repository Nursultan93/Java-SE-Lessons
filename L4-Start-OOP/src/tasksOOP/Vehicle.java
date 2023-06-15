package tasksOOP;

import javax.swing.*;

public class Vehicle {
    protected int speed;

    public void accelerate(){
        speed = speed + 10;
    }

    public int displaySpeed(){
        return speed;
    }
}
