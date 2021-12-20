package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(12);
      list.add(13);
      list.add(14);
        System.out.println(list.size());
}
}
