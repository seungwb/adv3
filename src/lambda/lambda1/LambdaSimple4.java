package lambda.lambda1;

public class LambdaSimple4 {
    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2; // 기본
        MyCall call2 = (value) -> value * 2; // 타입추론
        MyCall call3 = value -> value * 2; // 매개변수 1개일때 가능
    }


    interface MyCall {
        int call(int value);
    }
}
