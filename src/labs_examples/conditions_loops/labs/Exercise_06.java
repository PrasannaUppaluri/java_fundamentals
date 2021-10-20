package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while(a <= 100){
            b+= a;
            a++;

        }
        System.out.println("the sum of the numbers is" +b);
    }
}
