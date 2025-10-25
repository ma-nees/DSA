import java.util.*;
public class Array2Dlinearsearch {
    public static void main(String[] args) {
        int arr[][] = {
            {24, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 3}
        };
        int target = 18;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j}; // return position
                }
            }
        }
        return new int[]{-1, -1}; // not found
    }
}
