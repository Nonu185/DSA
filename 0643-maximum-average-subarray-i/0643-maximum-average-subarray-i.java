class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double cur = 0;
        double res =Integer.MIN_VALUE;
        int left =0;
        for(int i=0;i<k;i++){
             cur+=nums[i];
        }
         res=cur/k;
          
          for(int i=k;i<n;i++){
            cur=cur+nums[i]-nums[i-k];
            res=Math.max(res,cur/k);
          }
        return res; 
        
    }
}