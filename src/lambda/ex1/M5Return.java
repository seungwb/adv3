package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    static MyFunction getOperation(String operator){
        MyFunction operation;
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            case "mul" -> (a, b) -> a * b;
            case "div" -> (a, b) -> a / b;
            default -> null;
        };
    }

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");

        System.out.println("add " + add.apply(1, 2));
        System.out.println("sub " + sub.apply(1, 2));
    }
}
