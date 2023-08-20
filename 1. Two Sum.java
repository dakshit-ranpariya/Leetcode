class Solution {
    public int[] twoSum(int[] nums, int target) {
       

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int ans = target - nums[i];
            if(map.containsKey(ans) && map.get(ans) != i){
                return new int[]{i, map.get(ans)};
            }
        }
        return new int[]{};
        
       

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
       
        
            
    }
   
}
