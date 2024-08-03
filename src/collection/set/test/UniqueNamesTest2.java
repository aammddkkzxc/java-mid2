package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        List<Integer> list = Arrays.asList(inputArr);
        Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
