package funcionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // Check with normal Java function
        System.out.println("\n// Check with normal Java function");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("070000000000"));
        System.out.println(isPhoneNumberValid("09000987300"));

        // Check with Predicate
        System.out.println("\n// Check with Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000987300"));

        // Chained Check with Predicate
        System.out.println("\n// Chained Check with Predicate");
        System.out.println(
                isPhoneNumberValidPredicate
                        .and(containsNumber3)
                        .test("07000003000")
        );
        System.out.println(
                isPhoneNumberValidPredicate
                        .and(containsNumber3)
                        .test("070000000000")
        );
        System.out.println(
                isPhoneNumberValidPredicate
                        .or(containsNumber3)
                        .test("09000987300")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
