package input;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputMain {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop/file";

        try {
            FileInputStream fileInputStream = new FileInputStream(desktopPath +"/textout.txt");

            int i = 0;

            do {

                byte[] buf = new byte[1024];
                i = fileInputStream.read(buf);

                String value = new String(buf, StandardCharsets.UTF_8);
                System.out.print(value);

            } while (i != -1);


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
