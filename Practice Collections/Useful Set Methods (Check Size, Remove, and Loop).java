import java.util.HashSet;
import java.util.Set;

public class SetExample4 {
    public static void main(String[] args) {
        Set<String> tools = new HashSet<>();
        tools.add("Hammer");
        tools.add("Screwdriver");
        tools.add("Wrench");

        // 1. Check if an item exists
        if (tools.contains("Hammer")) {
            System.out.println("Hammer is in the toolset.");
        }

        // 2. Remove an item
        tools.remove("Wrench");

        // 3. Get the size of the set
        System.out.println("Total tools left: " + tools.size());

        // 4. Loop (Iterate) through the set
        System.out.println("Remaining Tools:");
        for (String tool : tools) {
            System.out.println("- " + tool);
        }
    }
}
