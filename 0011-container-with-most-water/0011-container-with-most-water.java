class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r=height.length-1;
        int ans =0;
        while(l<r){
            int wi=r-l;
            int hig = Math.min(height[l],height[r]);
            int currentwater = wi * hig;
            ans = Math.max(ans,currentwater);
            
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
        
    }
}