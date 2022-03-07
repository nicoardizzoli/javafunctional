package optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {

        //si estamos seguros que el valor nunca va a ser null usamos Optional.of
        //Si puede ser null, Optional.ofNullable
        Optional<String> stringOptional = Optional.of("Hello");

        stringOptional.isPresent();
        stringOptional.isEmpty();

        stringOptional.ifPresent(System.out::println);

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("world"));


        //si no esta presente, es como un default value
        stringOptional.orElse("world");


        //si no esta presente y quiero hacer algo
        stringOptional.orElseGet(() -> {
            //lo que quiera hacer
            return "hola";
        });


        //se puede aplicar metodos de los streams en los optionals
        stringOptional.map(String::toUpperCase).orElse("world");


        //si sabemos que el valor va a estar pero que algo puede pasar.
        stringOptional.map(String::toUpperCase).orElseThrow(IllegalStateException::new);
    }
}
