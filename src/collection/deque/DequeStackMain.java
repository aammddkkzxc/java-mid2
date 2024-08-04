package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
