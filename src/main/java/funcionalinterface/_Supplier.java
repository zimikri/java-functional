package funcionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBconnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBconnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customers"
            );
}
