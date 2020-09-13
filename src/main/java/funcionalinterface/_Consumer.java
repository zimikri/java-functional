package funcionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");

        // Normal Java function
        greetCustomer(maria);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(customer);

    static void greetCustomer(Customer customer) {
        System.out.println(customer);
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
