package lambdassteam;

import java.util.List;

import static lambdassteam.DataGenerator.getstringToReverse;

public class LambdaProcessor {

    public static void countriesWithO() {
        List<String> countries = DataGenerator.getCountriesList();

        System.out.println("\nExercise 1:");

        System.out.println("\nComplete list of countries:");
        countries.forEach(System.out::println);

        System.out.println("\nList of countries containing 'o':");
        countries.stream()
                .filter(country -> country.toLowerCase().contains("o"))
                .forEach(System.out::println);
    }

    public static void countriesWithOAnd5() {
        List<String> countries = DataGenerator.getCountriesList();

        System.out.println("\nExercise 2:");

        System.out.println("\nComplete list of countries:");
        countries.forEach(System.out::println);

        System.out.println("\nList of countries containing 'o' And 5 letters:");
        countries.stream()
                .filter(country -> country.toLowerCase().contains("o") && country.length() == 5)
                .forEach(System.out::println);
    }

    public static void monthWithLambda() {
        List<String> months = DataGenerator. getMonthList();

        System.out.println("\nExercise 3:");

        System.out.println("\nList of Months (with Lambda):");
        months.forEach(month -> System.out.println(month));
    }

    public static void monthWithReference() {
        List<String> months = DataGenerator. getMonthList();

        System.out.println("\nExercise 4:");

        System.out.println("\nList of Months (with Reference):");
        months.stream()
                .forEach(System.out::println);
    }

    public static void piAsDouble() {
        System.out.println("\nExercise 5:");

        PiValueProvider piProvider = () -> 3.1415;
        double piValue = piProvider.getPiValue();

        System.out.println("Value of PI: " + piValue);
    }

    public static List<Object> orderMixedListWithLambda() {
        List<Object> mixedList = DataGenerator.getMixedList();

        System.out.println("\nExercise 6:");

        System.out.println("\nOriginal list: " + mixedList);

        mixedList.sort((o1, o2) -> Integer.compare(
                o1.toString().length(),
                o2.toString().length()
        ));

        System.out.println("\nList ordered by string length using lambda: " + mixedList);
        return mixedList;
    }

    public static List<Object> orderDescendantMixedListWithLambda() {
        List<Object> mixedList = DataGenerator.getMixedList();

        System.out.println("\nExercise 7:");

        System.out.println("\nOriginal list: " + mixedList);

        mixedList.sort((o1, o2) -> Integer.compare(
                o2.toString().length(),
                o1.toString().length()
        ));

        System.out.println("\nDescendant ordering of mixed list by string length with lambda: " + mixedList);
        return mixedList;
    }

    public static void reverseString() {
        StringReverser reverser = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };

        String reversedString = reverser.reverse(getstringToReverse());

        System.out.println("\nExercise 8:");

        System.out.println("\nString Reverser Test:");
        System.out.println("Original string: " + getstringToReverse());
        System.out.println("Reversed string: " + reversedString);

        boolean isCorrect = reversedString.equals(reversedString);
        System.out.println("Verification: " + (isCorrect ? "Passed ✓" : "Failed ✗"));
    }

}