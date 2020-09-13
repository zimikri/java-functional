package funcionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");

        // Normal Java function
        System.out.println("\n// Normal Java function");
        greetCustomer(maria);
        greetCustomerV2(maria, true);
        greetCustomerV2(maria, false);

        // Consumer Functional interface
        System.out.println("\n// Consumer Functional interface");
        greetCustomerConsumer.accept(maria);

        // Consumer BiFunctional interface
        System.out.println("\n// Consumer BiFunctional interface");
        greetCustomerConsumerV2.accept(maria, true);
        greetCustomerConsumerV2.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(customer);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println(
                    "Hello " + customer.name +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.phoneNumber : "******")
            );

    static void greetCustomer(Customer customer) {
        System.out.println(customer);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println(
                "Hello " + customer.name +
                        ", thanks for registering phone number " +
                        (showPhoneNumber ? customer.phoneNumber : "******")
        );
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Hello " + name +
                    ", thanks for registering phone number " +
                    phoneNumber;
        }
    }
}
