import java.util.TreeSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        // Create a TreeSet of Integers
        Set<Integer> numbers = new TreeSet<>();

        // Adding numbers out of order
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // Duplicate, will be ignored

        // Printing the set (it will be sorted automatically)
        System.out.println("Sorted Numbers: " + numbers);
    }
}
