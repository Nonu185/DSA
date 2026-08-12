class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int l = n-1;
        while(s<=l){
            int m = s+(l-s)/2;
            if(nums[m]==target){
                return m;
            }
           else if(nums[m]>target){
                l=m-1;
            }
            else{
                s=m+1;
            }
        }
        return s;
        
    }
}