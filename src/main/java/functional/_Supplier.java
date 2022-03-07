package functional;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        getDBConecctionUrlSupplier.get();
    }

    //IMPERATIVE
    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    //functional
    static Supplier<String> getDBConecctionUrlSupplier = () -> "jdbc://localhost:5432/users";
}
