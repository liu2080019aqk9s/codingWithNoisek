

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        // the usual:
        ProductWarehouse juice2 = new ProductWarehouse("Juice", 1000.0);
        juice2.addToWarehouse(1000.0);
        juice2.takeFromWarehouse(11.3);
        System.out.println(juice2.getName()); // Juice
        juice2.addToWarehouse(1.0);
        System.out.println(juice2);           
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
        juice.printAnalysis();
        // etc

        // however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor...

        // so we only get the initial state of the history set by the constructor...
    }

}
