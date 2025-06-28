package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntegerFilter {

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
