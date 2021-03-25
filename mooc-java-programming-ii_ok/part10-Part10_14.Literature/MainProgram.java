
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if("".equals(input)) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input, age));
            System.out.println("");
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        for (Book book : books) {
            System.out.println(book.getName() + " (recommended for " + book.getAge() + " year-olds or older");
        }
//        books.stream()
//                .sorted((b1, b2) -> b1.getAge() - b2.getAge())
//                .forEach (book -> System.out.println(book.getName() + " (recommended for " + book.getAge() + " year-olds or older)"));
//        for (String title : books.keySet()) {
//            System.out.println(title + " (recommended for " + books.get(title) + " year-olds or older)");
//        }
        
    }

}
