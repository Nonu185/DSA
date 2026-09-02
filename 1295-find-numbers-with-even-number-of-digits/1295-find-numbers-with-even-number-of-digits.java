class Solution {
    public int findNumbers(int[] nums) {
        int count =0;


        int n = nums.length;
        for(int i =0;i<n;i++){
            int d =0;
            int t=nums[i];

            while(t>0){
                d++;
                t/=10;
            }
            if(d%2==0){

              count++;
            
            }
        }
        return count;
        
    }
}