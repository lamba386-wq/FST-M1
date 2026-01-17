package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Encapsulated Plane class
class Plane {
    // Make fields private
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // onboard(): add passengers using add()
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full. Cannot add more passengers.");
        }
    }

    // takeOff(): returns current date and time, and updates lastTimeTookOff
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    // land(): sets lastTimeLanded to now and clears passengers
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // getLastTimeLanded(): return lastTimeLanded
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // getPassengers(): return passengers list
    public List<String> getPassengers() {
        return passengers;
    }
}

