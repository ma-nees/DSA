import java.util.Scanner;

public class Leetcode326 { 

    // Recursive function
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of 3 ✅");
        } else {
            System.out.println(n + " is NOT a power of 3 ❌");
        }

        sc.close();
    }
}
