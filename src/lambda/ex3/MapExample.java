package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {

    public static List<String> map(List<String> list, UnaryOperator<String> function) {
        List<String> result = new ArrayList<>();
        for(String s : list) {
            result.add(function.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");

        List<String> upperLists = map(list, s -> s.toUpperCase());

        System.out.println(upperLists);

        List<String> appendStar = map(list, s -> "***" + s + "***");

        System.out.println(appendStar);
    }
}
