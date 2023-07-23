package lambda;

public class Main {

//    (param1, param2, param3) -> {
//
//    }

    public static void main(String[] args) {

        //Before java 1.8
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Men cercive cekdim");
            }
        };

        d.draw();

        //After java 1.8

        Drawable d2 = ()-> {
            System.out.println("Men Kravrat cekirem");
            System.out.println("Men Daire cekirem");
            System.out.println("Men Ucbucaq cekirem");
        };

        d2.draw();

    }
}

//@FunctionalInterface
interface Drawable {
    void draw();
}