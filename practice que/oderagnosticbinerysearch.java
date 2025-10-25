public class oderagnosticbinerysearch {
        public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int target = 11;
        int ans=oderagnostic(arr, target);
        System.out.println(ans);
    }
    static int oderagnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc=arr[start]<arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid+1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid+1;
                }else{
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }
}
