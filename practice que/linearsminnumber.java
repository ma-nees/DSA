public class linearsminnumber {
    public static void main(String[] args) {
    int arr[]={18,12,7,3,14,28};
    System.out.println(minnumber(arr));
    }
    static  int minnumber(int [] arr){
        int minnum=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]<minnum){
                minnum=arr[i];
                
            }
        }
        return minnum;
    }
}
