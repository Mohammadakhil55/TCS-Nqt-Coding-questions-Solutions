/*check even or odd */
/*dynamic way */
import java.util.Scanner;
public class even_odd{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println((n%2==0)?"even":"odd");

    }
}