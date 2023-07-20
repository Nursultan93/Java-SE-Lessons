package input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SeqInputMain {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop/file";

        try {
            FileInputStream fis1 = new FileInputStream(desktopPath+"/textout.txt");
            FileInputStream fis2 = new FileInputStream(desktopPath+"/textout1.txt");
            FileInputStream fis3 = new FileInputStream(desktopPath+"/textout2.txt");
            FileInputStream fis4 = new FileInputStream(desktopPath+"/textout3.txt");

            Vector<InputStream> v = new Vector<>();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            v.add(fis4);

            Enumeration<InputStream> enumeration = v.elements();

            SequenceInputStream sq = new SequenceInputStream(enumeration);

            int i = 0;

            while ((i = sq.read()) != -1) {
                System.out.print((char) i);
            }

            fis1.close();
            fis2.close();
            fis3.close();
            fis4.close();
            sq.close();

        }catch (IOException e){
            System.err.println(e);
        }

//        try {
//            FileInputStream fis1 = new FileInputStream(desktopPath+"/textout.txt");
//            FileInputStream fis2 = new FileInputStream(desktopPath+"/textout1.txt");
//
//            SequenceInputStream sequenceInputStream = new SequenceInputStream(fis1, fis2);
//
//            int i = 0;
//
//            while ((i=sequenceInputStream.read()) != -1){
//                System.out.print((char) i);
//            }
//
//            fis1.close();
//            fis2.close();
//            sequenceInputStream.close();
//
//        }catch (IOException e) {
//            System.err.println(e);
//        }
    }
}
