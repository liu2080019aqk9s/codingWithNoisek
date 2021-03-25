
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(line -> line.split(","))
                .sorted((l1, l2) -> {if (Double.valueOf(l1[5]) - Double.valueOf(l2[5]) > 0) {
                    return 1;
                } else if (Double.valueOf(l1[5]) < Double.valueOf(l2[5])) {
                    return -1;
                } else {
                    return 0;
                }})
                .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1] + ", " + line[5]));
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
