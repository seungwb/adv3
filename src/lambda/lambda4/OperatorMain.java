package lambda.lambda4;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorMain {

    public static void main(String[] args) {
        // UnaryOperator
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("square.apply(9) = " + square.apply(9));

        // BinaryOperator
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("sum.apply(1,2) = " + sum.apply(1, 2));
    }
}
