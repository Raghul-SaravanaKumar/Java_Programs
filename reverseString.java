public class reverseString {
    public static void main(String[] args) {
        String og = "Hello World";
        String rev = "";

        for(int i = og.length() - 1; i >= 0; i--){
            rev =rev + og.charAt(i);
        }
        System.out.println(rev);
    }
}
