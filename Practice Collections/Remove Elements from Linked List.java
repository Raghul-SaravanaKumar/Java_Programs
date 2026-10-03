import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Index 1-la irukura element-a remove pandrom (20 remove aagum)
        numbers.remove(1); 

        // First matrum Last elements-a remove pandrom
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("Remaining Numbers: " + numbers);
    }
}
