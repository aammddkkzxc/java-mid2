package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    public void add(int index, Object o) {
        Node newNode = new Node(o);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;

        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;

        return removeNode;
    }

    private Node getLastNode() {
        Node node = first;
        while (node.next != null) {
            node = node.next;
        }

        return node;
    }

    public Object set(int index, Object o) {
        Node node =  getNode(index);
        Object oldValue = node.item;
        node.item = o;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(Object o) {
        int index = 0;

        for (Node node = first; node != null ; node = node.next) {
            if (o.equals(node.item)) {
                return index;
            }
        }

        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
