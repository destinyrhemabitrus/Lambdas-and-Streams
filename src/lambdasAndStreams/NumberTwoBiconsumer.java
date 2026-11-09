package lambdasAndStreams;

import java.util.function.BiConsumer;

public class NumberTwoBiconsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
    }
}