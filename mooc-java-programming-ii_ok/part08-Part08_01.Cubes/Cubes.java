
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
            input = scanner.nextLine();
    }
        
    }
}
