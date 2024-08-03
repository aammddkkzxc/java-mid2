package collection.set;

public class MyHashSetMainV0 {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();

        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println(result);

        System.out.println(set.contains(4));
        System.out.println(set.contains(8));
    }
}
