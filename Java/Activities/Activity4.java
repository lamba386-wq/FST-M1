package activities;

public class Activity4 {

    public static void main(String[] args) {

        // 1. Initialize an array with numbers in random order
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        // Display array before sorting
        System.out.print("Before sorting: ");
        printArray(arr);

        // 2. Insertion sort (ascending order)
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // current element to insert
            int j = i - 1;         // last index of the sorted part

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key at correct position
            arr[j + 1] = key;
        }

        // Display array after sorting
        System.out.print("After sorting : ");
        printArray(arr);
    }

    // Helper method to print array
    private static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
