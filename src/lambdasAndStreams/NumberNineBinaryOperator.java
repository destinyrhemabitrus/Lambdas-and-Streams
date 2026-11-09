package lambdasAndStreams;

import java.util.function.BinaryOperator;

public class NumberNineBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> fibonacci = (x, y) -> x * y;
    }
}
