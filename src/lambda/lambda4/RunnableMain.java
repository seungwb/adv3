package lambda.lambda4;

public class RunnableMain {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable.run()");
            }
        };

        runnable.run();
        Runnable runnable1 =()-> System.out.println("runnable1.run()");
        runnable1.run();

    }
}
