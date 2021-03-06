package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {
static int a;
static int b;//static for variables, methods & classes- it is associated with the class & not with the object.
    public static void main(String[] args) {

        double val = 10.5;
        char c = 'A';
        int z = (int)c;
        int y = (int)val;
        System.out.println("this is explicit casting or narrowing "+ z);


    }
}
