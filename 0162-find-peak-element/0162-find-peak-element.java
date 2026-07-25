class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int s=0;
        int l=n-1;
        while(s<l){
            int m=s+(l-s)/2;
            if(nums[m]<nums[m+1]){
               s=m+1;
            }
            else{
               l=m;
            }
        }
        return s;
    }
}