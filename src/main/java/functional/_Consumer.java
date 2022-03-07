package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer nicolas = new Customer("Nicolas", "9999");

        //imperative
        greetCustomer(nicolas);

        //functional
        greetCustomerConsumer.accept(nicolas);
    }


     //IMPERATIVE
    static void greetCustomer(Customer customer) {
        System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    //FUNCTIONAL: CONSUMER ES COMO UNA FUNCION VOID. TOMA EL ARGUMENTO Y NO DEVUELVE NADA.
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : ""));






    static class Customer {
        private String customerName;
        private String customerPhoneNumber;

        public Customer() {
        }

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
