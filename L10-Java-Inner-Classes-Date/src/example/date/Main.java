package example.date;

import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String saat = "01:54:20.233719";

        LocalTime localTime = LocalTime.parse(saat);

        System.out.println(localTime);

    }
}
