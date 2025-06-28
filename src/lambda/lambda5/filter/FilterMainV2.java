package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*//짝수만 거르기
        List<Integer> evenNumbers = filter(numbers, 0);

        System.out.println(evenNumbers);
        //홀수만 거르기
        List<Integer> oddNumbers = filter(numbers, 1);
        System.out.println(oddNumbers);*/

        List<Integer> evenNumbers = filter(numbers, (a) -> a % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = filter(numbers, (a) -> a % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        /*List<Integer> filters = new ArrayList<>();
        for (Integer number : numbers) {
            BiPredicate<Integer, Integer> testResult = (b, c) -> b % 2 == c;
            if (testResult.test(number, a)) {
                filters.add(number);
            }
        }
        return filters;*/

        List<Integer> filter = new ArrayList<>();
        for (Integer number : numbers) {
            boolean testResult = predicate.test(number);
            if (testResult) {
                filter.add(number);
            }
        }
        return filter;
    }

}
