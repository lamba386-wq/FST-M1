package activities;

public class Activity3 {

    public static void main(String[] args) {

        double seconds = 1000000000;

        double EarthSeconds   = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds   = 0.61519726;
        double MarsSeconds    = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds  = 29.447498;
        double UranusSeconds  = 84.016846;
        double NeptuneSeconds = 164.79132;

        // First: age in Earth years
        double earthYears = seconds / EarthSeconds;

        // Age on each planet (in that planet's years)
        double mercuryAge = earthYears / MercurySeconds;
        double venusAge   = earthYears / VenusSeconds;
        double marsAge    = earthYears / MarsSeconds;
        double jupiterAge = earthYears / JupiterSeconds;
        double saturnAge  = earthYears / SaturnSeconds;
        double uranusAge  = earthYears / UranusSeconds;
        double neptuneAge = earthYears / NeptuneSeconds;

        // Print results (rounded to 2 decimal places)
        System.out.println("Given seconds: " + (long) seconds);
        System.out.println("Age on Earth   : " + String.format("%.2f", earthYears));
        System.out.println("Age on Mercury : " + String.format("%.2f", mercuryAge));
        System.out.println("Age on Venus   : " + String.format("%.2f", venusAge));
        System.out.println("Age on Mars    : " + String.format("%.2f", marsAge));
        System.out.println("Age on Jupiter : " + String.format("%.2f", jupiterAge));
        System.out.println("Age on Saturn  : " + String.format("%.2f", saturnAge));
        System.out.println("Age on Uranus  : " + String.format("%.2f", uranusAge));
        System.out.println("Age on Neptune : " + String.format("%.2f", neptuneAge));
    }
}
