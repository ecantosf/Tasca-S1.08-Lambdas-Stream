package lambdassteam;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuExercises {

    private static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> {
                    List<String> result = LambdaProcessor.getCountriesWithO();
                    System.out.println("\nCountries containing 'o': " + result);
                }
                case 2 -> {
                    List<String> result = LambdaProcessor.getCountriesWithOAndMoreThan5Letters();
                    System.out.println("\nCountries with 'o' and more than 5 letters: " + result);
                }
                case 3 -> LambdaProcessor.monthWithLambda();
                case 4 -> LambdaProcessor.monthWithReference();
                case 5 -> LambdaProcessor.piAsDouble();
                case 6 -> LambdaProcessor.orderMixedListWithLambda();
                case 7 -> LambdaProcessor.orderDescendantMixedListWithLambda();
                case 8 -> LambdaProcessor.reverseString();
                case 9 -> runAllExercises();
                case 0 -> {
                    System.out.println("Exiting program. Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }

            if (!exit && choice != 0) {
                pause();
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          LAMBDAS & STREAMS EXERCISES MENU");
        System.out.println("=".repeat(50));
        System.out.println("1. Countries containing 'o'");
        System.out.println("2. Countries with more than 5 letters");
        System.out.println("3. Months list (with Lambda)");
        System.out.println("4. Months list (with Method Reference)");
        System.out.println("5. PI value as Double");
        System.out.println("6. Order mixed list by string length");
        System.out.println("7. Order mixed list descendant by string length");
        System.out.println("8. Reverse string");
        System.out.println("9. Run ALL exercises");
        System.out.println("0. Exit");
        System.out.println("-".repeat(50));
        System.out.print("Enter your choice (0-9): ");
    }

    private static int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear invalid input
            return -1; // Return invalid choice
        }
    }

    private static void pause() {
        System.out.println("\n" + "-".repeat(50));
        System.out.print("Press Enter to continue...");
        scanner.nextLine(); // Consume newline from previous nextInt()
        scanner.nextLine(); // Wait for Enter key
    }

    private static void runAllExercises() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         RUNNING ALL EXERCISES");
        System.out.println("=".repeat(50));

        System.out.println("\nExercise 1: " + LambdaProcessor.getCountriesWithO());
        System.out.println("\nExercise 2: " + LambdaProcessor.getCountriesWithOAndMoreThan5Letters());

        LambdaProcessor.monthWithLambda();
        LambdaProcessor.monthWithReference();
        LambdaProcessor.piAsDouble();

        System.out.println("\nExercise 6: " + LambdaProcessor.orderMixedListWithLambda());
        System.out.println("\nExercise 7: " + LambdaProcessor.orderDescendantMixedListWithLambda());

        LambdaProcessor.reverseString();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("        ALL EXERCISES COMPLETED");
        System.out.println("=".repeat(50));
    }
}