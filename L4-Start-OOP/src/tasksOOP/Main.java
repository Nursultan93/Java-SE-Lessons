package tasksOOP;

public class Main {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        Car c = new Car();

        c.accelerate(70);
        c.displaySpeed();

        v.accelerate(60);
        v.displaySpeed();

    }
}
