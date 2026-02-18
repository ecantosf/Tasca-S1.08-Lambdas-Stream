package lambdassteam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static lambdassteam.DataGenerator.getstringToReverse;

public class LambdaProcessor {

    public static List<String> getCountriesWithO() {
        List<String> countries = DataGenerator.getCountriesList();

        return countries.stream()
                .filter(country -> country.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }

    public static void printCountriesWithO() {
        List<String> countries = getCountriesWithO();
        System.out.println("\nList of countries containing 'o':");
        countries.forEach(System.out::println);
    }

    public static List<String> getCountriesWithOAndMoreThan5Letters() {
        List<String> countries = DataGenerator.getCountriesList();

        return countries.stream()
                .filter(country -> country.toLowerCase().contains("o") && country.length() > 5)
                .collect(Collectors.toList());
    }

    public static void printCountriesWithMore5Letters() {
        List<String> countries = getCountriesWithOAndMoreThan5Letters();
        System.out.println("\nList of countries containing 'o' and more than 5 letters:");
        countries.forEach(System.out::println);
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

    public static List<String> orderMixedListWithLambda() {
        List<Object> mixedList = DataGenerator.getMixedList();

        System.out.println("\nExercise 6:");
        System.out.println("\nOriginal list: " + mixedList);

        List<String> stringList = mixedList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("\nStrings ordered by length (shortest to longest): " + stringList);
        return stringList;
    }

    public static List<String> orderDescendantMixedListWithLambda() {
        List<Object> mixedList = DataGenerator.getMixedList();

        System.out.println("\nExercise 7:");
        System.out.println("\nOriginal list: " + mixedList);

        List<String> stringList = mixedList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println("\nStrings ordered by length (longest to shortest): " + stringList);
        return stringList;
    }

    public static void reverseString() {
        StringReverser reverser = (str) -> new StringBuilder(str).reverse().toString();

        String originalString = getstringToReverse();
        String reversedString = reverser.reverse(originalString);

        System.out.println("\nExercise 8:");
        System.out.println("\nString Reverser Test:");
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);

        boolean isCorrect = reversedString.equals(new StringBuilder(originalString).reverse().toString());
        System.out.println("Verification: " + (isCorrect ? "Passed ✓" : "Failed ✗"));
    }

}