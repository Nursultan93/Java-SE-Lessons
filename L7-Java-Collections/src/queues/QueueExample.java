package queues;

import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Baku");
        queue.add("London");
        queue.add("Berlin");

        System.out.println("Head: " + queue.element());
        System.out.println("Head1: "+queue.peek());

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===========");

        queue.poll();

        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println("===========");

        queue.offer("Istanbul");

        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println("===========");

        boolean isLondon = queue.contains("London");

        System.out.println(isLondon);

        System.out.println("===========");

        queue.removeIf(item -> item.startsWith("I"));

        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println("===========");

        queue.remove("Berlin");

        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println("===========");

        queue.clear();

        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println("Size: "+queue.size());

    }
}
