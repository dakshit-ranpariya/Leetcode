class Solution {
    public String convertToBase7(int num) {
        // if(num==0) return "0";
        // StringBuilder ans = new StringBuilder();
        
        // int temp = num;
        // if(temp<0){
        //     temp = Math.abs(temp);
        // }
        // while(temp!=0){
        //     int mod = temp%7;
        //     ans.append(mod);
        //     temp = temp / 7;
        // }
        // if(num<0){
        //     ans.append("-");
        // }
        // ans.reverse();
        // return ans.toString();


        //INBUILT
        return Integer.toString(num, 7);
    }
}
