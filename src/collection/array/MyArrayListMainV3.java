package collection.array;

public class MyArrayListMainV3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(1, "fix");
        System.out.println(list);

        list.add(0, "addFirst");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
