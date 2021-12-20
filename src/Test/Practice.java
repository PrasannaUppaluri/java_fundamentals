package Test;

import java.util.ArrayList;
public class Practice {



    public static void main(String[] args) {



            // please demonstrate how to declare a Two-Dimensional Array
            // with a height of 4 and a width of 5 below
         //   int[][] two_d_array = new int[2][10];

            // using a nested for loop, please populate every index in the 2-D Array
          //  for(int i = 0;i < two_d_array.length;i++){
            //    for(int j =0; j< two_d_array[i].length;j++){
              //     two_d_array[i][j] = i+j;
               // }
            //}
            //for(int i = 0;i < two_d_array.length;i++){
              //  for(int j =0; j< two_d_array[i].length;j++){
                //    System.out.println(two_d_array[i][j]);


          //  public static void  printGuests()

        //YOUR CODE BELOW

        /*  1.  First create and initialize an ArrayList called guests.
                Remember, the syntax to create an ArrayList is:
                ArrayList<type> name = new ArrayList<type>();   */

        ArrayList<String> names = new ArrayList<String>();


        /*  2.  Now add the following names to the list using .add() :
                Arnold, Gerald, Eugene, Helga, Phoebe in that order */
        names.add("Arnold");
        names.add("Gerarld");
        names.add("Eugene");
        names.add("Helga");
        names.add("Phoebe");


        /*  3.  Print the names using a ForEach loop.
                Remember, the syntax for the ForEach loop is:
                for(type element: collection) { code }          */
        for(String s:names) {
            System.out.println(s);
        }

/*  4.  Eugene wont be able to make it.
        Remove him from the list using .remove() */
            names.remove(2);

            /*  5. Print the list again  */
            for(String i : names ){
                System.out.println(i);
            }


        //YOUR CODE ABOVE
    }


    }

        //

        // once populated, use a nested for loop to print each element in the 2-D array





