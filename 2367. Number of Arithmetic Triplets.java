class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int ans1 = nums[i] - diff;
            if(set.contains(ans1)){
                int ans2 = ans1 - diff;
                if(set.contains(ans2)){
                    count++;
                }
            }
            set.add(nums[i]);
        }

        return count;


    }
}
