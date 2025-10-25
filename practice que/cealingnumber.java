public class cealingnumber {
         public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int target = 11;

        Sort(arr);

        int ceil = ceiling(arr, target);
        if (ceil == -1) {
            System.out.println("No ceiling found (target is greater than all elements).");
        } else {
            System.out.println("Ceiling of " + target + " is: " + ceil);
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

    // Ceiling Function
    static int ceiling(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        // If target is greater than the largest element → no ceiling
        if (target > arr[right]) {
            return -1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // exact match is also a ceiling
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // After loop ends, left points to the smallest element >= target
        return arr[left];
    }
}
