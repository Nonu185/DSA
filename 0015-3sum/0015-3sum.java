class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
            continue;
            }
            int s = i+1;
            int l= n-1;
            while(s<l){
                if(nums[i]+nums[s]+nums[l]==0){
                    ans.add(Arrays.asList(nums[i],nums[s],nums[l]));
                    s++;
                    l--;
                    while(s<l && nums[s]==nums[s-1]){
                        s++;
                    }
                    while(s<l && nums[l]==nums[l+1]){
                        l--;
                    }
                }
                else if(nums[i]+nums[s]+nums[l]>0){
                    l--;
                }
                else{
                    s++;
                }
            }
        }
        return ans;
        
    }
}