
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if ("".equals(input)) {
                break;
            }
            inputList.add(input);
        }
        inputList.stream()
                .forEach(inputLine -> System.out.println(inputLine));
        //String output = inputList.stream()
        //        .reduce("", (previousString, value) -> previousString + "\n" + value);
        //System.out.println(output);
    }
}
