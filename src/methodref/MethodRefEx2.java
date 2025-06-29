package methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 1. 정적 메스더 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName; // 클래스:: 정벅메서드

        System.out.println("staticMethod1 = " + staticMethod1.apply("Kim"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("Kim"));

        // 2. 특정 객체의 인스턴스 처ㅏㅁ조
        Person person = new Person("Kim");

        Function<Integer, String> instanceMethod1 = number -> person.introduceWithNumber(number);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;

        System.out.println("instanceMethod1 = " + instanceMethod1.apply(5));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(6));

        // 3. 생성자 참조

        Function<String, Person> newPerson1 =name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

        System.out.println("newPerson1 = " + newPerson1.apply("Kim"));
        System.out.println("newPerson2 = " + newPerson2.apply("Kim"));
    }
}
