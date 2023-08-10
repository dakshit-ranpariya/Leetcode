class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums){
            if(i%2==0){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }else{
                    map.put(i, 1);
                }
            }
        }
        if(map.size() == 0) return -1;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(Map.Entry<Integer, Integer> me : map.entrySet()){
            if(me.getValue() > max){
                max = me.getValue();
                ans = me.getKey();
            }
            if(me.getValue() == max){
                ans = Math.min(ans, me.getKey());
            }
        }
        return ans;
    }
}
