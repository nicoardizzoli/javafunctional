package functional;

import java.util.function.Predicate;

public class _Predictate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("02000000000"));
        System.out.println(isPhoneNumberValid("03000000000"));

        //Usando predicate
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));

        //predicates encadenados. Se puede usar AND o OR
        isPhoneNumberValidPredicate.and(containsNumber3).test("0200000450000");
        isPhoneNumberValidPredicate.or(containsNumber3).test("020000003000");

        //Tambien hay BiPredicates y se manejan igual que los otros

    }

    static Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = s -> s.contains("3");

}
