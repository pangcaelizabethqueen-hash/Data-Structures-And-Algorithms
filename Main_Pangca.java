import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> lines = new LinkedList<>();

        // Add items to the queue (Enqueue)
        lines.offer("Alice");
        lines.offer("Bob");
        lines.offer("Charlie");

        System.out.println("Queue after adding items:");
        for (String name : lines) {
            System.out.println(name);
        }

        // Remove the front item (Dequeue)
        lines.poll();

        System.out.println("\nNext item in line (peek): " + lines.peek());

        System.out.println("Queue values remaining:");
        for (String name : lines) {
            System.out.println(name);
        }
    }
}