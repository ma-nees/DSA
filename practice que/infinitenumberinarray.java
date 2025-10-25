public class infinitenumberinarray {
    public static void main(String[] args) {
        int arr[]={ 3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr,int target){
        //first find the range
        // first start with a box of size 2
        int  start =0;
        int end=1;
        while(target > arr[end]){
             //double the box value
            int temp=end+1; 
            // end=end+sizeofbox*2
            end=end=(end-start+1)*2;
            start=temp;
        }
        return bs(arr, target,start,end );
    }
    static int bs(int arr[], int target,int start,int end) {
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


