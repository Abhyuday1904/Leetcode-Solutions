class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans =0;
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        if(x>=y)
        {
            for(int i=1;i<s.length();i++){
                if(st.size() == 0){
                    st.add(s.charAt(i));
                    continue;
                }
                if(st.peek() == 'a' && s.charAt(i) == 'b'){
                    st.pop();
                    ans += x;
                } 
                else st.add(s.charAt(i));
            
            }

            if(st.size()>1){
                
            int rem = st.size();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<rem;i++){
                sb.append(st.pop());
                }
                sb.reverse();

            st.add(sb.charAt(0));
            for(int i=1;i<rem;i++){
                if(st.size() == 0){
                    st.add(sb.charAt(i));
                    continue;
                }
                if(st.peek() == 'b' && sb.charAt(i) == 'a'){
                    st.pop();
                    ans += y;
                } 
                else st.add(sb.charAt(i));
            }
            }
        }

        else {
            for(int i=1;i<s.length();i++){
                if(st.size() == 0){
                    st.add(s.charAt(i));
                    continue;
                }
                if(st.peek() == 'b' && s.charAt(i) == 'a'){
                    st.pop();
                    ans += y;
                } 
                else st.add(s.charAt(i));
            }

            if(st.size()>1){
                int rem = st.size();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<rem;i++){
                sb.append(st.pop());
                }
                sb.reverse();
            st.add(sb.charAt(0));
            for(int i=1;i<rem;i++){
                if(st.size() == 0){
                    st.add(sb.charAt(i));
                    continue;
                }
                if(st.peek() == 'a' && sb.charAt(i) == 'b'){
                    st.pop();
                    ans += x;
                } 
                else st.add(sb.charAt(i));
            }
            }
        }
        return ans;
    }
}