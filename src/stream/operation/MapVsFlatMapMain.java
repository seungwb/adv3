package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {

    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1, 2),
                List.of(5, 6),
                List.of(3, 4)
        );

        //for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : lists) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }
        System.out.println("lists = " + lists);
        System.out.println("forResult = " + forResult);

        //map

        List<Stream<Integer>> streamList = lists.stream()
                .map(list -> list.stream())
                .toList();

        System.out.println("streamList = " + streamList);

        // flatMap

        List<Integer> integerList = lists.stream()
                .flatMap(list -> list.stream())
                .toList();

        System.out.println("integerList = " + integerList);
    }
}
