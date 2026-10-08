import java.util.*

public class Solution{
  public static void main (String[] test){
    Scanner sc = new Scanner (System.in);
    String S = sc.nextLine().toUpperCase();
    S = S.replaceAll("\\s+"," ");
    System.out.print(S);
  }
}
