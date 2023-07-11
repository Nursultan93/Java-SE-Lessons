package inner.classes.example;

public class ExampleStaticInner {

    static class StaticInnerClass{

        static String name = "Salam";

        void print(){
            System.out.println("Static classes method printing...");
        }

        static void capEt() {
            System.out.println("Cap edilir...");
        }
    }
}
