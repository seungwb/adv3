package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initNum, IntBinaryOperator reducer) {

        int result = initNum;

        for (Integer i : list) {
            result = reducer.applyAsInt(result, i);
        }
        return result;

    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);


        int addResult = reduce(list, 0, (a, b) -> a + b);

        System.out.println("addResult = " + addResult);

        int mulResult = reduce(list, 1, (a, b) -> a * b);

        System.out.println("mulResult = " + mulResult);

    }
}
