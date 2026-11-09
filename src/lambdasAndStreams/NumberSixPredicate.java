package lambdasAndStreams;

import java.util.function.Predicate;

public class NumberSixPredicate {
    public static void main(String[] args) {
        Predicate<String> emailChecker = email -> email.contains("@");

        System.out.println(emailChecker.test("zicco@mail.com"));
        System.out.println(emailChecker.test("ziccomail.com"));
    }
}
