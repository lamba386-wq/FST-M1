package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        // Create Plane object with maxPassengers = 10
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        // Take off and print time
        Date takeOffTime = plane.takeOff();
        System.out.println("Plane took off at: " + takeOffTime);

        // Print list of passengers
        System.out.println("Passengers on board: " + plane.getPassengers());

        try {
            // Pause for 5 seconds to simulate flight
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land and print landing time
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    }
}
