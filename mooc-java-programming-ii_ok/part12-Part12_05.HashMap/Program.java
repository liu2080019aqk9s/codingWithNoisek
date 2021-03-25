
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
        HashMap<String, String> hm = new HashMap<>();
        hm.add("lol", "kot");
        hm.add("a", "b");
        hm.add("lol", "kot2");
        String value = hm.get("lol");
        System.out.println(value);
        hm.remove("lol");
        String value2 = hm.get("lol");
        System.out.println(value2);
    }

}
