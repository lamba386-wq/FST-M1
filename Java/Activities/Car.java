package activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor – initialize tyres and doors
    public Car() {
        tyres = 4;
        doors = 4;
    }

    // Display all characteristics
    public void displayCharacteristics() {
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    // Accelerate method
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Brake method
    public void brake() {
        System.out.println("Car has stopped.");
    }
}

