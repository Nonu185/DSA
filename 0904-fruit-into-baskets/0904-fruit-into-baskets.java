class Solution {
    public int totalFruit(int[] fruits) {
        int left =0;
        int max = 0;
        int n = fruits.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int right =0;right<n;right++){
            int c = fruits[right];
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size()>2){
                int leftchar = fruits[left];
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
                int len = right-left+1;
                max=Math.max(max,len);
        }
        return max;
    }
}