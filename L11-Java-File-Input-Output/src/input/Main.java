package input;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int i = System.in.read();

            System.out.println((char) i);

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
