package activities;

interface BicycleParts {
    int tyres = 2;        // number of tyres on the bicycle
    int maxSpeed = 40;    // max speed of bicycle
}

// Interface for bicycle operations
interface BicycleOperations {
    void applyBrake(int decrement);  // how much to slow down the bicycle by
    void speedUp(int increment);     // how much to speed up the bicycle by
}
