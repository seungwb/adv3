package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {
        Procedure procedure1 = () -> {
            System.out.println("procedure");
        };
        procedure1.run();

        Procedure procedure2 = () -> System.out.println("procedure2");

        procedure2.run();
    }
}
