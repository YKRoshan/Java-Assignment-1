/*
* Program that takes a character from the user as input and determines whether
 * the character entered is a capital letter, a small case letter, a digit or
  * a special symbol and display appropriately.
* */
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if( (ch>64) && (ch<91) ){             /*If character is capital letter*/
            System.out.println("Capital Letter");
        } else if ( (ch>96) && (ch<122) ){    /*If character is small letter*/
            System.out.println("Small Letter");
        } else if ( (ch>47) && (ch<58) ){      /*If character is number*/
            System.out.println("Number");
        }
        else{                                  /*If character is special symbol*/
            System.out.println("Special Symbol");
        }

    }
}
