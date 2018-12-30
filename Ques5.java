/*
*Program that reads an unspecified number of integer
*arguments using Scanner Class and adds them together.
*/
import java.util.Scanner;

public class Ques5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");
        while (scanner.hasNextInt()) {    /*For unspecified number of inputs*/
            System.out.println("Enter a number to add and other character to print sum: ");
            sum+=scanner.nextInt();
        }
        System.out.println("Sum = "+sum);
    }
}
