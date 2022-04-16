package combinatorPattern;

import java.time.LocalDate;


import static combinatorPattern.CustomerRegistrationValidator.*;


public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(
                "Divyanshu",
                "divyanshusingh6747@gmail.com",
                "+07478383838",
                LocalDate.of(2000, 1, 1)
        );
//        System.out.println(new CustomerValidatorService().isValid(customer));
        //Using Combinator pattern
         ValidationResult result= isEmailValid()
                .and( isPhoneValid())
                .and( isAdult())
                .apply(customer);
        System.out.println(result);
        if(result!=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
