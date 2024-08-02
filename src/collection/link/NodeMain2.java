package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);

        System.out.println(first);
        System.out.println(first.next);
    }
}
