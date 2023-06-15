package tasksOOP;

public class Car extends Vehicle{
    private String model;


    public Car(){

    }

    public void accelerate(){
        speed = speed + 20;
    }

    public int displaySpeed(){
        return speed;
    }
}
