package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        List<Integer> list = Arrays.asList(inputArr);
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
