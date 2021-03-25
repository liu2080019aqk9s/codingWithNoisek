import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (checker.isDayOfWeek(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        if (checker.allVowels(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        if (checker.timeOfDay(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
