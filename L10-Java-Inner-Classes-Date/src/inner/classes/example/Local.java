package inner.classes.example;

public class Local {

    void print() {
        System.out.println("Printring...");

        class LocalInner {
            void message() {
                System.out.println("Message");
            }
        }

        LocalInner inner = new LocalInner();
        inner.message();
    }
}
