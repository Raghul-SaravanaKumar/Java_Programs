import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // For-each loop use panni iterate pandrom
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
