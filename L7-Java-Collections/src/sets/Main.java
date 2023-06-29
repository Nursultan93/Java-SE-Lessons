package sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();

        Person samir1 = new Person(1, "Samir", "Xelilov");
        Person samir2 = new Person(1, "Samir", "Xelilov");

        Set<Person> s = Set.of(samir1, samir2);

        personSet.add(samir1);
        personSet.add(samir2);

        System.out.println(personSet.size());


        for (Person p : personSet){
            System.out.println(p.getFirstName() +" " +p.getLastName());
        }
    }
}
