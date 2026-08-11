public class InsertAsterisk {
    public static void main(String[] args) {
        String input = "hello world";
        String result = "";

        for (int i = 0; i < input.length() - 1; i++) {
            result += input.charAt(i);

            if (input.charAt(i) == input.charAt(i + 1)) {
                result += "*";
            }
        }

        if (input.length() > 0) {
            result += input.charAt(input.length() - 1);
        }

        System.out.println("Original: " + input);
        System.out.println("Result:   " + result);
    }
}
