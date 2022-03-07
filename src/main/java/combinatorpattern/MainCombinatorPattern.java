package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class MainCombinatorPattern {
    public static void main(String[] args) {
        Customer customer = new Customer("Alioce", "alicegmail.com", "+02342342", LocalDate.of(1992, 2, 24));
        Boolean valid = new CustomerValidatorService().isValid(customer);
        System.out.println(valid);


        //USING COMBINATOR PATTERN
        ValidationResult validationResult = isAdult().and(isEmailValid()).and(isPhoneNumberValid()).apply(customer);

        System.out.println(validationResult);

        if (validationResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validationResult.name());

        }
    }
}
