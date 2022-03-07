package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Nicolas", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Roberto", Gender.MALE)
        );

        //Imperative approach: si quiero saber cuantas females hay en la lista
        //en el paradigma imperativo, tenemos que definir cada paso que queremos que haga el programa
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        System.out.println(females);


        //Functional Approach: nos concentramos en lo que queremos
        System.out.println("Functional Approach");
        List<Person> femalesCollected = people.stream()
                .filter(p -> p.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);

    }













    static class Person {
        private String name;
        private Gender gender;

        public Person() {
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", gender=").append(gender);
            sb.append('}');
            return sb.toString();
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
