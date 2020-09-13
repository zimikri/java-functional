package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Object value = Optional.ofNullable(null)
//            .orElseThrow(() -> new IllegalStateException("exeption"));
//        System.out.println(value);

        Optional.ofNullable(null)
//        Optional.ofNullable("john@gmail.com")
            .ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("No email provided")
            );

    }
}
