package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);

        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
