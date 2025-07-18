package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result1 = (String)upperCase.apply("hello");
        System.out.println(result1);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer s) {
                return s *s;
            }
        };
        Integer result2 = (Integer) square.apply(3);
        System.out.println(result2);
    }


    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
