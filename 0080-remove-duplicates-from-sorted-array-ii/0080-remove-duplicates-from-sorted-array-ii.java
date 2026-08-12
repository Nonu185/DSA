class Solution {
    public int removeDuplicates(int[] nums) {
        int j =2;
        int n = nums.length;
        int l = n-1;
        int i =2;
        while(i<=l){
            if(nums[i]!=nums[j-2]){
            nums[j]=nums[i];
               j++;
            }
            i++;
        }
        return j; 
    }
}