package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_06 {

    public static void main(String[] args) {
        float radius = 3.14f;
        int height = 5;
        float surfaceArea = (float) (2*(3.14 * radius * (height + radius)));
        float volume = (float)3.14 * (radius * radius) *height;
        System.out.println(surfaceArea);
        System.out.print(volume);
    }
}