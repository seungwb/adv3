package lambda.start;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){
        long startNs = System.nanoTime();

        //코드 조각 시작
        int randonValue = new Random().nextInt(6)+1;
        System.out.println("주사위 = " + randonValue);

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");

    }

    public static void helloSun() {
        long startNs = System.nanoTime();

        //코드 조각 시작
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);

        }

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        helloDice();
        helloSun();
    }
}
