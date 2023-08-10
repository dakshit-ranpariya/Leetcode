class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char i:magazine.toCharArray()){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        
        for(char i : ransomNote.toCharArray()){
            if(map.containsKey(i) && map.get(i)>0){
                map.put(i, map.get(i)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
