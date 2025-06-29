package stream.basic;

import java.util.List;
import java.util.stream.Collectors;

public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList = " + originList);

        List<Integer> filteredList = originList.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println("filteredList = " + filteredList);
        System.out.println("originList = " + originList);

    }
}
