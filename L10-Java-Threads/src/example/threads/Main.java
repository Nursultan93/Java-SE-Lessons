package example.threads;

public class Main {

    //1. First Come First Server
    //2. Time-slicing scheduling
    //3. Preemptive-priority scheduling


    public static void main(String[] args) {
        ThreadExampleWithThreadClass threadClass1 = new ThreadExampleWithThreadClass("Name1");
        ThreadExampleWithThreadClass threadClass2 = new ThreadExampleWithThreadClass("Name2");

        threadClass1.start();
        threadClass2.start();

        Runnable runnable =new ThreadExampleWithRunnableInterface();
        Thread thread = new Thread(runnable);

        System.out.println(thread.getId());

        thread.start();
    }

}
