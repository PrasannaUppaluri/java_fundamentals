package labs_examples.conditions_loops.labs;

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
        String s = scanner.next();

        int number = 0;
        while (number <= s.length()) {
            if (((s.charAt(number) == 'a'))||
            ((s.charAt(number) == 'e')) || ((s.charAt(number) == 'i')) || ((s.charAt(number) == 'o')) || ((s.charAt(number) == 'u'))) {
                System.out.println("The first vowels is :"+s.charAt(number)+s.indexOf(number));
                System.out.println("The word is:"+s);


            }
            number++;

        }


    }

}






