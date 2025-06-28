package lambda.lambda3;

public class GenericMain2 {

    public static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        String result1 = (String)upperCase.apply("hello");
        System.out.println(result1);

        ObjectFunction square = s -> ((Integer)s * (Integer) s);
        Integer result2 = (Integer) square.apply(3);
        System.out.println(result2);
    }


    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
