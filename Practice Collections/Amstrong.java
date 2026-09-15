import java.util.*;
 class Amstrong {
    int n;
    Amstrong (int n){
        this.n = n;
        int temp = n;
        int sum = 0;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Amstrong armstrong = new Amstrong(num);
        sc.close();
    }
}