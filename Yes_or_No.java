import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the full method name and the query string
        if (sc.hasNextLine()) {
            String methodName = sc.nextLine().trim();
            if (sc.hasNextLine()) {
                String query = sc.nextLine().trim();
                
                // Extract all uppercase characters from the method name
                StringBuilder upperCaseSeq = new StringBuilder();
                for (int i = 0; i < methodName.length(); i++) {
                    char ch = methodName.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        upperCaseSeq.append(ch);
                    }
                }
                
                // Verify if the extracted sequence exactly matches the query
                if (upperCaseSeq.toString().equals(query)) {
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
            }
        }
        sc.close();
    }
}
