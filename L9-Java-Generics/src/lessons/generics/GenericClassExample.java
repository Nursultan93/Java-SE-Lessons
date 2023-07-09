package lessons.generics;

public class GenericClassExample {

    //T - Type
    //E - Element
    //K - Key
    //N - Number
    //V - Value

    public static <A> void print(A[] array) {

        if (array.length == 0) {
            throw new RuntimeException("Arrayda element yoxdur");
        }

        for (A e : array){
            System.out.println(e);
        }
    }


}
