import java.util.LinkedList;

public class AddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Vijay");
        names.add("Ajith");

        // First matrum Last positions-la add pandrom
        names.addFirst("Suriya");
        names.addLast("Vikram");

        System.out.println("Updated List: " + names);
    }
}
