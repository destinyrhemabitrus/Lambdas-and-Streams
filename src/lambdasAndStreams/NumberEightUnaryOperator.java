package lambdasAndStreams;

import java.util.function.UnaryOperator;

public class NumberEightUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;

        System.out.println(square.apply(5));
    }
}
