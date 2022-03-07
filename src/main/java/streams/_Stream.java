package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Nicolas", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Roberto", Gender.MALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println); //esto se llama method reference

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals(Gender.FEMALE));

        boolean notContainsFemales = people.stream()
                .anyMatch(person -> person.gender.equals(Gender.FEMALE));
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
