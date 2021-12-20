package labs_examples.objects_classes_methods.labs.objects;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Controller {
    public static void main(String[] args) {
        Sample s = new Sample();
        Sample s1 = new Sample("Prasanna",39,"Uppaluri");
        Sample s2 = new Sample("Lavin",1);
        System.out.println(s1.firstname);
        System.out.println(s2.age);
        System.out.println(s);
    }
}
