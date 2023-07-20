package output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutMain {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop/file";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(desktopPath+"/textout.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

            String text = "men java oyrenirem.";

            byte [] b = text.getBytes();

            bos.write(b);

            bos.flush();
            bos.close();

            System.out.println("Success");


        }catch (IOException e) {
            System.err.println(e);
        }

    }
}
