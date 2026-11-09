package lambdasAndStreams;

import java.util.function.Consumer;

public class NumberOneConsumer {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = (number)->System.out.println(number);
    }
}
