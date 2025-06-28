package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //짝수만 거르기
        List<Integer> evenNumbers = filterEvenNumbers(numbers);

        System.out.println(evenNumbers);
        //홀수만 거르기
        List<Integer> oddNumbers = filterOddNumbers(numbers);
        System.out.println(oddNumbers);

    }

    private static List<Integer> filterOddNumbers(List<Integer> numbers) {
        List<Integer> filters = new ArrayList<>();
        for (Integer number : numbers) {
            boolean testResult = number % 2 != 0;
            if (testResult) {
                filters.add(number);
            }
        }
        return filters;
    }

    private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> filters = new ArrayList<>();
        for (Integer number : numbers) {
            boolean testResult = number % 2 == 0;
            if (testResult) {
                filters.add(number);
            }
        }
        return filters;
    }
}
