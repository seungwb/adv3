package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Generic 추가
public class MyStreamV3<T> {

    private List<T> internallist;

    private MyStreamV3(List<T> internallist) {
        this.internallist = internallist;
    }

    // static factory
    public static <T> MyStreamV3<T> of(List<T> internallist) {
        return new MyStreamV3<>(internallist);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for(T element : internallist) {
            if(predicate.test(element)) {
                filtered.add(element);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (T element : internallist) {
            mapped.add(mapper.apply(element));
        }
        return MyStreamV3.of(mapped);
    }

    public List<T> toList() {
        return internallist;
    }

    // 추가
    public void forEach(Consumer<T> consumer) {
        for(T element : internallist) {
            consumer.accept(element);
        }
    }
}
