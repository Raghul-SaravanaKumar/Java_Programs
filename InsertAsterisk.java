public class InsertAsterisk {
    public static void main(String[] args) {
        String input = "hello world";
        String result = "";

        // Loop through the string until the second to last character
        for (int i = 0; i < input.length() - 1; i++) {
            result += input.charAt(i);

            // Check if current character matches the next character
            if (input.charAt(i) == input.charAt(i + 1)) {
                result += "*";
            }
        }

        // Append the final character
        if (input.length() > 0) {
            result += input.charAt(input.length() - 1);
        }

        // Print the final output
        System.out.println("Original: " + input);
        System.out.println("Result:   " + result);
    }
}
