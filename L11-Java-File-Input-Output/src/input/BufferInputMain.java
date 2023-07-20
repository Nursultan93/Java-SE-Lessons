package input;

import java.io.*;

public class BufferInputMain {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop/file";


        try {
            FileInputStream fileInputStream = new FileInputStream(desktopPath +"/textout.txt");

            BufferedInputStream bif = new BufferedInputStream(fileInputStream);

            int i = 0;

            while ((i = bif.read()) != -1) {
                System.out.print((char) i);
            }

            bif.close();


        }catch (IOException e) {
            System.err.println(e);
        }
    }
}
