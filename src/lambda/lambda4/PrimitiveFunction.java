package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {

    public static void main(String[] args) {
        //기본형 매개변수, IntFunction, LongFunction, DoubleFunction

        IntFunction<String> function = x -> "숫자: " + x;
        System.out.println("function.apply(100) = " + function.apply(100));

        //기본형 반환, ToIntFunction, ToLongFunction, ToDoubleFunction

        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println("toIntFunction.applyAsInt(10) = " + toIntFunction.applyAsInt("10"));

        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100L;
        System.out.println("intToLongFunction.applyAsLong(10) = " + intToLongFunction.applyAsLong(10));

        // IntUnaryOperator
        IntUnaryOperator intUnaryOperator = x -> x * 100;
        System.out.println("intUnaryOperator.applyAsInt(10) = " + intUnaryOperator.applyAsInt(10));

    }

}
