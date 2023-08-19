class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int j=0;
        int k=1;
        for(int i:nums){
            if(i<0){
                ans[k] = i;
                k= k+2;
            }
            else{
                ans[j] = i;
                j = j+2;
            }  
        }
        return ans;
    }
}
