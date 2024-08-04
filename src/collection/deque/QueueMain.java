package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.offer(4);
        queue.poll();
        System.out.println(queue);

    }
}
