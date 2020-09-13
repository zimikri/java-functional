package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        String orElse = empty.orElse("Hello");
        System.out.println(orElse);

        Optional<String> notEmpty = Optional.of("Hello");
        System.out.println(notEmpty.isPresent());
        System.out.println(notEmpty.isEmpty());
    }
}
