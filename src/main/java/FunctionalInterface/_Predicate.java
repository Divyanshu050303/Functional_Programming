package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberPredicate.test("07000000000"));
        System.out.println("Is phone number valid and contains number 3 "+
                isPhoneNumberPredicate.and(containNumber3).test("07345231324"));
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07")&&phoneNumber.length()==11;
    }
    static Predicate<String> isPhoneNumberPredicate=phoneNumber->
            phoneNumber.startsWith("07")&&phoneNumber.length()==11;
    static Predicate<String> containNumber3=phoneNumber->
            phoneNumber.contains("3");
}
