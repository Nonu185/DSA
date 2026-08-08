class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double cur = 0;
        double res =Integer.MIN_VALUE;
        int left =0;
        for(int i=0;i<n;i++){
             cur+=nums[i];
            if(i-left+1==k){
                res= Math.max(res,cur/k);
                cur-=nums[left];
                left++;
           
            }
        }
        return res; 
        
    }
}