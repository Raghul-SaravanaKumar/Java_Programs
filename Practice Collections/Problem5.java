import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        System.out.println("Your List: " + list);

        // Dynamic search input
        System.out.print("Enter the name to search for: ");
        String searchName = sc.nextLine();

        int index = list.indexOf(searchName);

        if (index != -1) {
            System.out.println(searchName + " found at index: " + index);
        } else {
            System.out.println(searchName + " was not found in the list.");
        }

        sc.close();
    }
}
