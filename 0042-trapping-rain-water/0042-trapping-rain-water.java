class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i =0;
        int j = n-1;
        int leftmax =0;
        int rightmax=0;
        int total =0;
        while(i<j){
            leftmax=Math.max(leftmax,height[i]);
            rightmax=Math.max(rightmax,height[j]);
            if(leftmax<rightmax){
                total+=leftmax-height[i];
                i++;
            }
            else{
                total+=rightmax-height[j];
                j--;
            }
        }
        return total;
        
    }
}