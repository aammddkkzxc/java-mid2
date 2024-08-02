package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    @Override
    public String toString() {
        Node node = this;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (node != null) {
            sb.append(node.item);
            if (node.next != null) {
                sb.append(" -> ");
            }

            node = node.next;
        }

        sb.append("]");

        return sb.toString();
    }
}
