package labs_examples.objects_classes_methods.labs.methods;
class Car {
    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
 public class Example {

        public static void main(String[] args) {
            // create an object of the Example class so that we can call the non-static paintCar()
            // method below
            Example ex = new Example();

            // create a new Car object named "car" - it is a Blue Nissan XTerra
            Car car = new Car("Blue", "Nissan", "XTerra");
            // the line below will print "Blue"
            System.out.print("Car color is: " + car.getColor());
            // call the non-static paintCar() method using the "ex" object and pass the car object
           car= ex.paintCar(car);
            // the line below will print "Green"
            System.out.print("Car color is: " + car.getColor());


        }


        /* the method below accepts a Car object - it changes the color of the car - it does
        not need to return the car - because the carVar object in paintCar() is a reference
        to the object "car" created in the main() method. */
        public Car paintCar(Car carVar){
            carVar = new Car("Green","TOyota","2011");
            return carVar;
        }
    }







