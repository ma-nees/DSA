public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1, 56, 2, 76, 67};

        // find max of entire array
        System.out.println("Maximum element (whole array): " + max(arr));

        // find max from index 1 to 3
        System.out.println("Maximum element (index 1 to 3): " + max(arr, 1, 3));
    }

    // max of entire array
    public static int max(int[] arr) {
        return max(arr, 0, arr.length - 1);  // reuse range method
    }

    // max in a given range
    public static int max(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
