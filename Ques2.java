/*
 * program which accepts an integer number as input from the user
 * and perform the following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
/**/
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = scanner.nextLong();
        if ((n % 2 == 1) && (n > 20) && (n < 30)) {       /*If number is odd and exists between 20 to 30 */
            System.out.println("Tom");
        } else if (n % 2 == 0 && n > 20 && n < 30) {       /*If number is even and exists between 20 and 30 */
            System.out.println("Jerry");
        }
    }
}
