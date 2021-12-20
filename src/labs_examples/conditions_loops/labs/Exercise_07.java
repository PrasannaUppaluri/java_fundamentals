package labs_examples.conditions_loops.labs;

import java.util.Locale;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word of your choice!");
        String s = scanner.next().toLowerCase();
        String vowels = "aeiou";

        int number = 0;
        while (number < s.length()) {

            if (vowels.indexOf(s.charAt(number))!= -1) {// || ((s.charAt(number) == 'e')) || ((s.charAt(number) == 'i')) || ((s.charAt(number) == 'o')) || ((s.charAt(number) == 'u'))) {
                System.out.println("The first vowel is :" + s.charAt(number));
                System.out.println("The word is:" + s);
                break;


            }
            number++;

        }


    }
}



