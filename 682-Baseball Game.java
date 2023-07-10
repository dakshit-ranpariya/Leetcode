class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String i:operations){
            if(i.equals("C")){
                st.pop();
            }else if(i.equals("D")){
                st.push(st.peek()*2);
            }else if(i.equals("+")){
                int x = st.pop();
                int y = st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            }else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
