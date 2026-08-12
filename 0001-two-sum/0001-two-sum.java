class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
         int need = target-nums[i];
         if(map.containsKey(need)){
          int x= map.get(need);
            return new int[]{i,x};
         }
         map.put(nums[i],i); 
            } 
         int ans[]={};
         return ans;
    }
}
