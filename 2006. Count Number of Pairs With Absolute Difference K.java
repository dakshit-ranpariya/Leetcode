class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = nums[i]-k;
            if(map.containsKey(sum)){
                count+= map.get(sum);
            }
        }
        return count;



        // int count = 0;
        // int n=nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if((nums[i] - nums[j]) == k || (nums[j] - nums[i] == k)){
        //             count++;
                    
        //         }
        //     }
        // }
        // return count;
    }
}
