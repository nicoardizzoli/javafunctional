package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private Boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private Boolean isPhoneNumberValid(String phone) {
        return phone.startsWith("+0");
    }

    private Boolean isAdult(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears() > 18;
    }

    public Boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
    }


}
