package labs_examples.objects_classes_methods.labs.objects;

public class Sample {
    String firstname;
    int age;
    String lastname;

    public Sample(String firstname, int age, String lastname) {
        this.firstname = firstname;
        this.age = age;
        this.lastname = lastname;
    }

    public Sample(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public Sample() {
    }
}
