package lambda.ex2;

public class BuilderGreeterExample {

    public static StringFunction buildGreeter(String str){
        return s ->  str + ", " + s;
    }

    public static void main(String[] args) {
        StringFunction result =  buildGreeter("Bye");

        System.out.println("result.apply(\"Hello\") = " + result.apply("Java"));
    }
}
