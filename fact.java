/* factorial of a number */
/* Dynamic way */
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();                /*space complexity: O(1) */
        int fact = 1;
        for (int i = 1; i <= n; i++) {        /*time complexity: O(n) */
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
