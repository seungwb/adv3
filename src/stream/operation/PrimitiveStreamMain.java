package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {
        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //범위 생성 메서드 (IntStream, LongStream)
        IntStream range1 = IntStream.range(1, 6);
        IntStream range2 = IntStream.rangeClosed(1, 6);

        range1.forEach(n -> System.out.print(n + " "));
        System.out.println();
        range2.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 1. 통계 관련 메서드 (sum, average, max, min, count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average(): 평균값 계산
        double avg = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("avg = " + avg);

        // summartStatistics(): 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("stats = " + stats);

        // 2. 타입 변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 6).asLongStream();
        //IntStream -> DoubleStream
        DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();

        //IntStream -> Stream<Integer>
        Stream<Integer> boxed = IntStream.range(1, 6).boxed();

        // 3. 기본형 특화 매핑
        //int -> long 변환 매핑
        LongStream longStream1 = IntStream.range(1, 6)
                .mapToLong(i -> i * 10L);

        //int -> double
        DoubleStream doubleStream1 = IntStream.range(1, 6).mapToDouble(i -> i * 1.5);

        //int -> 객체 변환 매핑
        List<String> stream1 = IntStream.range(1, 6).mapToObj(i -> "Number: " + i).toList();
        System.out.println("stream1 = " + stream1);

        // 4. 객체 스트림 -> 기본형 특화스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.mapToInt(n -> n).sum();

        // 5. 객체 스트림 -> 기본형 특화 스트림으로 매핑 활용
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5);
        int sum1 = integerStream2.mapToInt(n -> n).sum();
        System.out.println("sum1 = " + sum1);
    }
}
