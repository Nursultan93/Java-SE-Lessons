package tasksOOP;

public class Car extends Vehicle{
    private String model;


    public Car(){
        model = "BMW";
    }

    public void accelerate(int speed){
        this.speed = speed + 20;
    }

    public int displaySpeed(){
        return speed;
    }

}
