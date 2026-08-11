class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int j = n-1;
        int sum =0;
        int i=0;
      while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            if(sum<target){
                i++;
            }
           else{
            j--;
           }
        }

        return new int[]{};
        
    }
}