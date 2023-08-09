
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[102];

        for(int i=0; i<nums.length; i++){
            bucket[nums[i]+1]++;
        }

        for(int i=1; i<102; i++){
            bucket[i] += bucket[i-1];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = bucket[nums[i]];
        }
        return nums;





        // Map<Integer, Integer> hash = new HashMap<>();

        // int[] copy = Arrays.copyOf(nums, nums.length);
        // Arrays.sort(copy);
        // int[] ans = new int[nums.length];

        // for(int i = 0; i<copy.length; i++){
        //     if(!hash.containsKey(copy[i])){
        //         hash.put(copy[i], i);
        //     }
        // }

        // for(int i=0; i<nums.length; i++){
        //     ans[i] = hash.get(nums[i]);
        // }

        // return ans;






        // int n=nums.length;
        // int[] ans = new int[n];
     
        
        // for(int i=0; i<n; i++){
        //     int count=0;
        //     for(int j=0; j<n; j++){
        //         if(nums[i] > nums[j] && (i != j)){
        //             count++;
        //         }
        //     }
        //     ans[i] = count;
        // }
        
        // return ans;

       
    }
}
