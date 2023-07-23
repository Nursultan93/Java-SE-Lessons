package lambda;

public class LambdaExpressionExampleWithThread {
    public static void main(String[] args) {
        Runnable runnable = ()->{System.out.println("Thread calisdi");};

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
