package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Esger esger = new Esger("Emil", "bas esger", "esger", "esger");
        Asbaz asbaz = new Asbaz("David", "cavus", "Yemekxana reisi", 10);

        List<Herbi> list = new ArrayList<>();
        list.add(esger);
        list.add(asbaz);
    }
}
