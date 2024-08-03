package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(30, 20, 20, 10, 10);
        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);
    }
}
