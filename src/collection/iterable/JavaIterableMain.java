package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        printAll(list.iterator());
        printAll(set.iterator());
        forEach(list);
        forEach(set);
    }

    private static void printAll(Iterator<String> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<String> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (String s : iterable) {
            System.out.println(s);
        }
    }
}
