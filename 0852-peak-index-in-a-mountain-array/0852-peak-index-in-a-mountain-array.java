class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n= arr.length;
        int ans =0;
        int i=0;
        int l=n-1;
        while(i<=l){
            int m = i+(l-i)/2;
            if(arr[m]<arr[m+1]){
                i=m+1;
            }
            else{
                ans=m;
                l=m-1;
            }
        }
        return ans;
        
    }
}