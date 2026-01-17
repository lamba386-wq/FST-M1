package activities;

public class Activity1 {

    public static void main(String[] args) {

        // Create a Car object
        Car Kia = new Car();

        // Set values
        Kia.color = "Black";
        Kia.transmission = "Manual";
        Kia.make = 2014;

        // Call methods
        Kia.displayCharacteristics();
        Kia.accelarate();
        Kia.brake();
    }
}
