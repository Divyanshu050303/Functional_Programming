package combinatorPattern;
import java.time.LocalDate;
public class Customer {
    private final String name;
    private final String email;
    private final String  PhoneNumber;
    private final LocalDate dob;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        PhoneNumber = phoneNumber;
        this.dob = dob;
    }

}
