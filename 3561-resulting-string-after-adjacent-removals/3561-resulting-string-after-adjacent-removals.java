class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for(int i = 1 ; i<s.length();i++){
            
            char ch = s.charAt(i);
            if(st.isEmpty()) st.add(ch);
            else {
                char c = st.peek();
            int peek = ((int)ch - 'a' + 1)%26;
            int curr = ((int)c - 'a'+1)%26;
            if(Math.abs(peek - curr) == 1 || (peek == 0 && curr == 25) || (peek == 25 && curr == 0)){
                st.pop();
            }
            else st.add(ch);
            }
            
        }
       // System.out.println(st.toString());
        StringBuilder sb = new StringBuilder();
        for (Character ch : st) {
               sb.append(ch); 
        }
        
        return sb.toString();
    }
}