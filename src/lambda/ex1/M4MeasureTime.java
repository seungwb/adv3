package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    public static void measure(Procedure p){
        System.out.println("실행전");
        long startNs = System.nanoTime();

        p.run();

        long endNs = System.nanoTime();
        System.out.println("실행후 결과: " + (endNs - startNs) +"ns");
    }

    public static void main(String[] args) {
        measure(()->{
            int n = 100;
            int result = 0;
            for(int i=1; i<=n; i++){
                result += i;
            }
            System.out.println("숫자의 합은 " + result + "입니다.");
        });

        measure(() -> {
            int[] arr = {4, 3, 2, 1};
            System.out.println("원본 배열: " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("바뀐 배열: " + Arrays.toString(arr));
        });
    }
}
