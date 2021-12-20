package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enther your choice");
        int[] numbers = new int[2];
        numbers[0]= scanner.nextInt();
        numbers[1]=scanner.nextInt();


        int count =0;
        for(int i = 0; i<numbers.length;i++) {
            count = numbers[i]+count;
        }
        System.out.println(count);






        }

            
            
        }


