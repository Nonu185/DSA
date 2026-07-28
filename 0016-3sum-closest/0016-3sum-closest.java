class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int s=i+1;
            int l=n-1;
            while(s<l){
              int sum=nums[i]+nums[s]+nums[l];
              if (Math.abs(sum - target) < Math.abs(closest - target)) {
               closest = sum;
                 }
                if(sum>target){
                    l--;
                }
                else if(sum<target){
                    s++;
                }
                else{
                    return sum;
                   }
            }
        }
        return closest;
        
    }
}