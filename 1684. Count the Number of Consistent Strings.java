class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char i:allowed.toCharArray()){
            set.add(i);
        }
        int count=0;
        for(String s : words){
            boolean flag = true;

            for(int i=0; i<s.length(); i++){
                if(!set.contains(s.charAt(i))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
            
        }
        return count;
    }
}
