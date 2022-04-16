package finalSection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Divyanshu", null, value->{
            System.out.println("no Last name provided for "+value);
        });

    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }
        else {
            callback.accept(firstName);
        }
    }
}
