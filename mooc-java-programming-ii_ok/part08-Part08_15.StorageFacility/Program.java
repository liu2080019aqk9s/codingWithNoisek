
public class Program {

    public static void main(String[] args) {
        // Test your program here
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
        StorageFacility facilit = new StorageFacility();
        facilit.add("a14", "ice skates");
        facilit.add("a14", "ice hockey stick");
        facilit.add("a14", "ice skates");

        facilit.add("f156", "rollerblades");
        facilit.add("f156", "rollerblades");

        facilit.add("g63", "six");
        facilit.add("g63", "pi");

        facilit.remove("f156", "rollerblades");

        System.out.println(facilit.contents("f156"));

        facilit.remove("f156", "rollerblades");

        System.out.println(facilit.storageUnits());

    }
}
