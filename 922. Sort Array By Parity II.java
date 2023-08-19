class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];

        int j=0;
        int k=1;
        for(int i:nums){
            if(i%2==0)
            {
                ans[j] = i;
                j+=2;
            }
            else
            {
                ans[k] = i;
                k+=2;
            }
        }
        return ans;
    }
}
