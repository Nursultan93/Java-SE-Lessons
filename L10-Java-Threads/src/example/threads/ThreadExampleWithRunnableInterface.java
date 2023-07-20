package example.threads;

public class ThreadExampleWithRunnableInterface implements Runnable{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        System.out.println("Thread runnable is running...");
    }
}
