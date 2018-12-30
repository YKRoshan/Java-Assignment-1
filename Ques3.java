/*
*Program that accepts a word as input and checks for each single
* character letter in the word whether it is a consonant or vowel.
* */

import java.util.Scanner;

public class Ques3 {
    public static void Fun(String str) {
        int l = str.length();
        for(int i = 0; i<l; i++) {
            if( !(( (str.charAt(i)>64) && (str.charAt(i)<91) ) ||
                    ( (str.charAt(i)>96) && (str.charAt(i)<123) )  ) ) {  /*If character is not a letter */
                System.out.println("Error All are not letters.");
                return;
            }
        }

        for(int i = 0; i<l; i++) {
            if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o')
                    || (str.charAt(i)=='u')) {              /*If letter is vowel */
                System.out.println(str.charAt(i)+" Vowel ");
            } else{                                          /*If letter is consonant */
                System.out.println(str.charAt(i)+" Consonant ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();
        Fun(str);
    }
}
