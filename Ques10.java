/*
* program for the following condition:
* Given 2 inputs , where input1 is string and input 2 is
* integer value, the last n characters should repeat n number
* of times in the output String.
* */
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int len = str.length();
        String ss = str.substring((len-n));
        System.out.print(str);
        for(int i=0;i<n;i++) {
            System.out.print(ss);
        }
    }
}
