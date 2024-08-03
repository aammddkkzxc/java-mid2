package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();
    }
}
