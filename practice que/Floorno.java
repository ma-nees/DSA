public class Floorno {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        Sort(arr);
        int floor = flooring(arr, target);

        if (floor == -1) {
            System.out.println("No floor exists (target is smaller than all elements).");
        } else {
            System.out.println("Floor of " + target + " is: " + floor);
        }
    }

    // Bubble Sort
    public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Flooring Function
    static int flooring(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        // If target is smaller than the smallest element → no floor
        if (target < arr[left]) {
            return -1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // exact match is also a floor
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // After loop ends, right points to the largest element smaller than target
        return arr[right];
    }
}
