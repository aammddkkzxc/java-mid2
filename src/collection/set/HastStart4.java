package collection.set;

public class HastStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] integers = new Integer[CAPACITY];

        add(integers, 1);
        add(integers, 2);
        add(integers, 5);
        add(integers, 8);
        add(integers, 14);
        add(integers, 99);

        int searchValue = 14;
        System.out.println(searchIndex(integers, searchValue)); //O(1) 성능
    }

    private static void add(Integer[] integers, int value) {
        int hashIndex = hashIndex(value);
        integers[hashIndex] = value;
    }

    private static int searchIndex(Integer[] integers, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        return integers[hashIndex];
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
