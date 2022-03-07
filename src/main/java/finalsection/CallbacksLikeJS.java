package finalsection;

import java.util.function.Consumer;

public class CallbacksLikeJS {
    public static void main(String[] args) {

        hello("Jhon", null, s -> {
            System.out.println("no lastname provided for: " + s);
        });

    }

    //COMO HACER FUNCIONES CALLBACK EN JAVA CON PROGRAMACION FUNCIONAL
    static void hello(String firstName, String lastname, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastname != null) {
            System.out.println(lastname);
        } else {
            callback.accept(firstName);
        }
    }
}
