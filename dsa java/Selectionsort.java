import java.util.Arrays;

public class Selectionsort {
    public static void main (String [] args){
        int arr[]={64,25,12,22,11};
        selectionsort(arr);
        System.err.println("Sorted array"+Arrays.toString(arr));
        
    }

    static void selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int minidx=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            //swap
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }
    }}

