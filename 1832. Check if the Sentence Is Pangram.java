class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashSet<Character> set = new HashSet<>();

        // for(char i:sentence.toCharArray()){
        //         set.add(i);
        // }
        // if(set.size()!=26) return false;
            
        // return true;


        for(char i=97; i<=122; i++){
            if(sentence.indexOf(i)==-1) return false;
        }
        return true;
        
    }
}
