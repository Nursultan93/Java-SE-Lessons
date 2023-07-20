package output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputMain {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop/file";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(desktopPath+"/textout.txt"); ///Users/nursultan/Desktop/textout.txt

            String yazilacaqMetin = "Men java input-ouput oyrenirem";

            byte[] b = yazilacaqMetin.getBytes();

            fileOutputStream.write(b);

            fileOutputStream.close();

            System.out.println("Success");


        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
