package optionals;

import java.util.Optional;

public class Main  {
    public static void main(String[] args) {
        Optional.ofNullable(null)
//                .orElseGet(()->"Default value");
//        .orElseThrow(()->new IllegalStateException("Exception"));
        .ifPresentOrElse( email->System.out.println("Sending email "+email),
                ()->System.out.println("Cannot send email"));

    }
}
