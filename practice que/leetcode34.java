public class leetcode34 {
    public static void main(String[] args) {
        int  nums[] = {5,7,7,8,8,10};
         int target = 8;
        leetcode34 obj = new leetcode34();
        int[] ans = obj.searchRange(nums, target);

        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
     
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans ={-1,-1};
        int left=search(nums,target,true);
        int right=search(nums,target,false);
        ans[0]=left;
        ans[1]=right;
        return ans;
    
    }
    int search(int [] nums,int  target,boolean leftrightindex){
        int ans=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]==target){
                ans= mid;
                if(leftrightindex==true){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
             else if (target < nums[mid]) {
                right = mid - 1;
            } 
            else{
                left= mid+1;
            }
        }
        return ans;
    }
}
