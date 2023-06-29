package list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Word");
        linkedList.add("Earth");
        linkedList.add("Hello");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        String firstElement =  linkedList.element();

        System.out.println(firstElement);

        System.out.println("==================");

        linkedList.addFirst("Poland");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        String lastElement =  linkedList.getLast();

        System.out.println(lastElement);

        System.out.println("==================");

        String element = linkedList.peek();

        System.out.println(element);

        System.out.println("==================");

        String element1 =  linkedList.pop();

        System.out.println(element1);

        System.out.println("==================");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        linkedList.offer("Iran");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        linkedList.offerFirst("Butan");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        linkedList.push("Kuveyt");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("==================");

        linkedList.set(4, "Turkey");

        for (String str : linkedList) {
            System.out.println(str);
        }
    }
}
