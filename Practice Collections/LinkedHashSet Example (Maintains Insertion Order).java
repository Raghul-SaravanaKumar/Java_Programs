import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample3 {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> names = new LinkedHashSet<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Vijay");
        names.add("Rahul"); // Duplicate, ignored

        // Printing the set (keeps insertion order)
        System.out.println("Names in Order: " + names);
    }
}
