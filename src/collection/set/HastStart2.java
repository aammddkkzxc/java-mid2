package collection.set;

import java.util.Arrays;

public class HastStart2 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];

        integers[1] = 1;
        integers[2] = 2;
        integers[5] = 5;
        integers[8] = 8;

        System.out.println(Arrays.toString(integers));

        int searchValue = 8;
        Integer result = integers[searchValue]; // O(1)
        System.out.println(result);
    }
}
