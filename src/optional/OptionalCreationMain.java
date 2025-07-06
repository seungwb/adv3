package optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalCreationMain {

    public static void main(String[] args) {
        // 1. of(): 값이 null이 아님이 확실할 때 사용
        String nonNullValue = "Hello Optional!";
        Optional<String> opt1 = Optional.ofNullable(nonNullValue);
        System.out.println("opt1 = " + opt1);

        // 2. ofNullable() : 값이 null일 수도 아닐 수도 있을 때
        Optional<String> opt2 = Optional.ofNullable("Hello!");
        Optional<String> opt3 = Optional.ofNullable(null);

        System.out.println("opt2 = " + opt2);
        System.out.println("opt3 = " + opt3);

        // 3. empty(): 비어있는 Optional을 명시적으로 생성
        Optional<Object> empty = Optional.empty();
        System.out.println("empty = " + empty);
    }
}
