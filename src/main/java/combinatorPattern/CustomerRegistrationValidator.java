package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorPattern.CustomerRegistrationValidator.*;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.IS_NOT_AN_ADULT;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.PHONE_NUMBER_VALID;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.EMAIL_NOT_VALID;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {
    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@")?
                SUCCESS: EMAIL_NOT_VALID;
    }
    static CustomerRegistrationValidator isPhoneValid(){
        return customer -> customer.getPhoneNumber().contains("+0")?
                SUCCESS: PHONE_NUMBER_VALID;
    }
    static CustomerRegistrationValidator isAdult(){
         return customer ->
                 Period.between(customer.getDob(), LocalDate.now()).getYears()>16
                 ? SUCCESS:IS_NOT_AN_ADULT;
    }
    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS)?other.apply(customer):result;
        };
    }
    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT

    }
}
