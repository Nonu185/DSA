class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        Collections.sort(nums);
        int n = nums.size()-1;
        int count =0;

        int i=0;
        int j = n;

        while(i<j){
            if(nums.get(i)+nums.get(j)<target){
                count=count+(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return count;
      
    }
}