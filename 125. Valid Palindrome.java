class Solution {
    public boolean checkPalindrome(String st, int s, int e){
        while(s<=e){
            if(st.charAt(s) != st.charAt(e)) return false;
            s++;
            e--;
        }
        return true;

        
        // RECURSION 

        // if(s>=e) return true;

        // if(st.charAt(s) != st.charAt(e)) return false;

        // return checkPalindrome(st, s+1, e-1);
    }
    public boolean isPalindrome(String a) {
        String st = "";
        for(int i=0; i<a.length(); i++){
            if(Character.isLetterOrDigit(a.charAt(i))) st+=Character.toLowerCase(a.charAt(i));
        }
        int s=0, e=st.length()-1;
        return checkPalindrome(st, s, e);
    }
}
