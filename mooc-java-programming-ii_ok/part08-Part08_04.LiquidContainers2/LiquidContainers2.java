
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();               

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if ("add".equals(command) && amount > 0){
                first.add(amount);
            }
            
            if ("move".equals(command) && amount > 0){
                second.add(Integer.min(amount,first.contains()));
                first.remove(amount);
            }
            
            if ("remove".equals(command) && amount > 0){
                second.remove(amount);
            }
        }
    }
}
