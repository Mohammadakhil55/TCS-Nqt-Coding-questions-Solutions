/*check number is prime or not */
/* Dynamic way */
import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();                 /* space complexity: O(1) */
        boolean isPrime = true;                
        if(a <= 1){
            isPrime = false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++){    /*time complexity: O(sqrt(n)) */
            if(a % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }

    }
}