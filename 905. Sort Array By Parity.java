class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];

        int i =0;
        int j = nums.length-1;

        for(int k:nums){
            if(k%2==0){
                ans[i] = k;
                i++;
            }else{
                ans[j] = k;
                j--;
            }
        }
        return ans;
    }
}
