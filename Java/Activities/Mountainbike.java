package activities;

class MountainBike extends Bicycle {

    int seatHeight;

    MountainBike(int gears, int startSpeed, int seatHeight) {
        super(gears, startSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }
}

