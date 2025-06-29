package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"), new Person("Baek"), new Person("Lee"));

        List<String> result1 = mapPersonToString(personList, (Person p) -> p.introduce());
        List<String> result2 = mapPersonToString(personList, Person::introduce);

        System.out.println("result1 = " + result1);

        System.out.println("result2 = " + result2);

        List<String> stringResult1 = mapStringToString(result1, (String s) -> s.toUpperCase());
        List<String> stringResult2 = mapStringToString(result1, String::toUpperCase);
        System.out.println("stringResult1 = " + stringResult1);
        System.out.println("stringResult2 = " + stringResult2);


    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
        List<String> result = new ArrayList<>();
        for (Person p : personList) {
            String applied = fun.apply(p);
            result.add(applied);
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            String applied = fun.apply(s);
            result.add(applied);
        }
        return result;
    }
}
