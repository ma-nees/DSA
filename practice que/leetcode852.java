public class leetcode852 {
    public static void main(String[] args) {
        int[] arr = {8,2,1,0};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int peakIndex = 0;  // assume first index is peak
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[peakIndex]) {
                peakIndex = i;  // store index, not value
            }
        }
        return peakIndex;
    }
}
