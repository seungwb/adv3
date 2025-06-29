package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsBasic {

    public static void main(String[] args) {
        List<String> list = Stream.of("java", "spring", "JPA")
                .collect(Collectors.toList()); // 수정 가능 리스트 반환
        System.out.println("list = " + list);

        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList()); // 수정 불가 리스트 반환
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 4, 3, 4, 5)
                .collect(Collectors.toSet());
        System.out.println("set = " + set);

        //타입 지정
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new)); // TreeSet 정렬 상태 유지
        System.out.println("treeSet = " + treeSet);

    }
}
