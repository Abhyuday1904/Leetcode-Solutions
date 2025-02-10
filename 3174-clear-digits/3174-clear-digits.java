class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            if(check(ch)){
                if(!st.isEmpty() && !check(st.peek())){
                    st.pop();
                }
                
            }
            else st.add(ch);
        }
        StringBuilder sb = new StringBuilder();
     while(st.size()>0){
        sb.append(st.pop());
        
      }
      sb = sb.reverse();
      return sb.toString();
        
    }
    private Boolean check(Character ch){
        if(ch == '1' ||ch == '2' ||ch == '3' ||ch == '4' ||ch == '5' ||ch == '6' ||ch == '7' ||ch == '8' ||ch == '9' || ch == '0'){
            return true;
        }
        return false;
    }
}