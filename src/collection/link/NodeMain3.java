package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        int index = 2;
        Node index2Node = getNode(first, index);

        add(first, "D");
    }

    private static void printAll(Node first) {
        Node node = first;
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }

    private static Node getLastNode(Node first) {
        Node node = first;
        while (node != null) {
            node = node.next;
        }

        return node;
    }

    private static Node getNode(Node first, int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    private static void add(Node first, String param) {
        Node lastNode = getLastNode(first);
        lastNode.next = new Node(param);
    }
}
