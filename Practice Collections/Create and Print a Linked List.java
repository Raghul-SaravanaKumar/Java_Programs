import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");

        System.out.println("Cars List: " + cars);
    }
}
