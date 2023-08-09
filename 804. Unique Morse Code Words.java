class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashMap<Character, String> map = new HashMap<>();
        for(char i='a'; i<='z'; i++){
            map.put(i, morse[i-'a']);
        }

        HashSet<String> set = new HashSet<>();

        for(String i:words){
            StringBuilder sb = new StringBuilder();
            for(char c : i.toCharArray()){
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
        
    }
}
