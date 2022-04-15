package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java function
        Customer divy=new Customer("Divyanshu", "9823242342");
    greetCustomer(divy);
    // Consumer Functional Interface
        greetCustomerConsumer.accept(divy);

//        this is biFunction
        greetCustomerConsumerV2.accept(divy, false);
    }
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2= (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+
                    ", Thanks for registering phone number "
                    +(showPhoneNumber?customer.customerPhoneNumber:"**********"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+
                ", Thanks for registering phone number "
                +customer.customerPhoneNumber);
    }
    static Consumer<Customer> greetCustomerConsumer= customer ->
            System.out.println("Hello "+customer.customerName+
            ", Thanks for registering phone number "
            +customer.customerPhoneNumber);
    static class Customer{
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        private final String customerName;
        private final String customerPhoneNumber;

    }
}
