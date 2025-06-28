package lambda.ex2;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        return s -> {
            String intermediate = f1.transform(s);
            return f2.transform(intermediate);
        };
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer toDeco = s -> "**" + s + "**";

        MyTransformer result = compose(toUpper, toDeco);

        System.out.println("result = " + result.transform("hello"));
    }
}
