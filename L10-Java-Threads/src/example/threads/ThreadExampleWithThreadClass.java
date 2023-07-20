package example.threads;

public class ThreadExampleWithThreadClass extends Thread {

    public ThreadExampleWithThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(this.getId());

        for (int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.getName()+ " is running...");
        }


    }
}
