
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        while (number != 0){
            if (number > 0){
                sum += number;
                count += 1;
            }
            number = Integer.valueOf(scanner.nextLine());
        }
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(Double.valueOf(sum)/count);
        }
    }
}
