import java.util.Arrays;

public class bubblesort {
    public static void main ( String [] args ){
        int arr[]={0,2,1,0,2,1};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void search (int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if (nums[j] > nums[j + 1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    
}
}
