class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0 ;i<s.length();i++){
          char ch = s.charAt(i);
           if(ch == '(' || ch == '[' || ch == '{') st.add(ch);
           else {
                if( ch == ')'){
                    if(!st.isEmpty() && st.peek() == '(') st.pop();
                    else st.add(ch);
                }
                else if( ch == ']'){
                    if(!st.isEmpty() && st.peek() == '[') st.pop();
                    else st.add(ch);
                }
                else if( ch == '}'){
                    if(!st.isEmpty() && st.peek() == '{') st.pop();
                    else st.add(ch);
                }

        }  
    }
    
    return st.isEmpty();
}
}