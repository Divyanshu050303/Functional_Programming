package FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnection());
        System.out.println(getDBConnectionSupplier.get());
    }
    static String getDbConnection(){
        return "jdbc://localhost";
    }
    static Supplier<String> getDBConnectionSupplier=()->"jdbc://localhost";
}
