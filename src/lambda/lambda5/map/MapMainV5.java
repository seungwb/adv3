package lambda.lambda5.map;

import lambda.lambda5.filter.GenericFilter;

import java.util.List;

import static lambda.lambda5.map.StringToIntegerMapper.map;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");

        //String -> String
        List<String> upperList = GenericMapper.map(list, s -> s.toUpperCase());
        System.out.println("upperList = " + upperList);

        //String -> Integer
        List<Integer> lengthList = GenericMapper.map(list, s -> s.length());
        System.out.println("lengthList = " + lengthList);

        //Integer -> String
        List<Integer> integers = List.of(1, 2, 3);
        List<String> star = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println("star = " + star);
    }


}
