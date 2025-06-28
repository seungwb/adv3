package lambda.ex2;

import java.util.List;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initNum, MyReducer reducer) {
        /*switch (s) {

            case "add":
                int addResult = 0;
                for(int a : list){
                    addResult = reducer.reduce(addResult, a);
                }
                return addResult;
            case "sub":
                int subResult = 0;
                for(int a : list){
                    subResult = reducer.reduce(subResult, a);
                }
                return subResult;
            case "mul":
                int mulResult = 1;
                for(int a : list){
                    mulResult = reducer.reduce(mulResult, a);
                }
                return mulResult;
        };
        return 0;*/
        int result = initNum;

        for (Integer i : list) {
            result = reducer.reduce(result, i);
        }
        return result;

    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);

       /* int sumResult = reduce(list, "add", (a, b) -> a + b);
        System.out.println(sumResult);

        int subResult = reduce(list, "sub", (a, b) -> a - b);
        System.out.println(subResult);

        int mulResult = reduce(list, "mul", (a, b) -> a * b);
        System.out.println(mulResult);*/

        int addResult = reduce(list, 0, (a, b) -> a + b);

        System.out.println("addResult = " + addResult);

        int mulResult = reduce(list, 1, (a, b) -> a * b);

        System.out.println("mulResult = " + mulResult);

    }
}
