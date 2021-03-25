
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;               

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if ("add".equals(command) && amount > 0){
                first = Integer.min (first + amount, 100);
            }
            
            if ("move".equals(command) && amount > 0){
                int toMove = Integer.min(amount, first);
                second = Integer.min (second + toMove, 100);
                first = Integer.max (first - amount, 0);
            }
            
            if ("remove".equals(command) && amount > 0){
                second = Integer.max (second - amount, 0);
            }
        }
    }

}
