/*
*program to reverse any string without using String Buffer.
**/
import java.util.*;
import java.lang.*;

public class Ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = scanner.next();
        StringBuffer str =new StringBuffer(st);

        int len=str.length();
        for(int i=0;i<len/2;i++) {
            char ch=str.charAt(i);
            str.setCharAt(i,str.charAt(len-i-1));
            str.setCharAt((len-i-1),ch);
        }
        System.out.println(str);
    }
}
