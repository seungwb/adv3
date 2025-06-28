package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filter(numbers, (a) -> a % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = filter(numbers, (a) -> a % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {

        List<Integer> filter = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filter.add(number);
            }
        }
        return filter;
    }

}
