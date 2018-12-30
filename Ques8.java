/*
* Program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
 * User should guess until the the target number is guessed correctly.
* */

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int random = (int )(Math.random() * 50 + 1);   /*Generating random number*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guessed number: ");
        int n = scanner.nextInt();
        if(n!=random)
        while (n!=random) {   /*While guessed number is not equal to original number*/
            if(n>random) {    /*If guessed number is greater than original number*/
                System.out.println("Number guessed is more than original number.");
            } else {          /*If guessed number is less than original number*/
                System.out.println("Number guessed is less than original number.");
            }

            System.out.println("Enter the guessed number: ");
            n=scanner.nextInt();
        }
        System.out.println("Number guessed matches the original number.");

    }
}
