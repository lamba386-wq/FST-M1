package activities;

public class Bicycle implements BicycleParts, BicycleOperations {

	public int gears;
    public int currentSpeed;
    
	public Bicycle(int gears, int startSpeed) {
	        this.gears = gears;
	        this.currentSpeed = startSpeed;
	    }

	    public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        if (currentSpeed < 0) {
	            currentSpeed = 0;
	        }
	        System.out.println("Applied brake. Current speed: " + currentSpeed);
	    }

	    public void speedUp(int increment) {
	        currentSpeed += increment;
	        if (currentSpeed > maxSpeed) {
	            currentSpeed = maxSpeed;
	        }
	        System.out.println("Sped up. Current speed: " + currentSpeed);
	    }

	    public String bicycleDesc() {
	        return ("No of gears are " + gears + "\nSpeed of bicycle is " + currentSpeed);
	    }
	}

	


