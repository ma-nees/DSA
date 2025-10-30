public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 2};
        insert(arr);
        
        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  // start from 1
            for (int j = i; j > 0; j--) {       // move left
                if (arr[j] < arr[j - 1]) {      // compare with previous
                    swap(arr, j, j - 1);        // swap if needed
                } else {
                    break;                      // stop if already sorted
                }
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

