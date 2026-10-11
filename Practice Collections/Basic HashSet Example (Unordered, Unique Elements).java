import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 2. Trying to add a duplicate (this will be ignored)
        fruits.add("Apple"); 

        // 3. Printing the set
        System.out.println("Fruits Set: " + fruits);
    }
}
