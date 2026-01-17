package activities;

public class Activity2 {

    public static void main(String[] args) {

        int[] numbers = {10, 77, 20, 54, -11, 10};
        int sum = 0;

        // Add all the 10's in the array
        for (int num : numbers) {
            if (num == 10) {
                sum += 10;
            }
        }

        // Check if sum is exactly 30
        boolean result = (sum == 30);

        System.out.println("Sum of all 10's: " + sum);
        System.out.println("Is sum exactly 30? " + result);
    }
}
