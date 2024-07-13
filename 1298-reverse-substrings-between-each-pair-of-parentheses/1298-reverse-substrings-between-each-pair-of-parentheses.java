class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i) == ')'){
                while(st.size()>0 && st.peek() != '('){
                    q.add(st.pop());
                  //  System.out.println(st);
                }
                st.pop();
                while(q.size()>0){
                    
                    st.add(q.poll());
                   // System.out.println(st);
                }
            }
            else st.add(s.charAt(i));

        }
        int rem  = st.size();
        for(int i=0;i<rem;i++){
            sb.append(st.pop());
        }
        return sb.reverse().toString();  
    }
}