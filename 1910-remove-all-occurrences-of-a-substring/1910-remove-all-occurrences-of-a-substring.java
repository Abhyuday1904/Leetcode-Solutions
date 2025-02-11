class Solution {
    public String removeOccurrences(String s, String part) {
       int len = part.length();
       Stack<Character> st = new Stack<>();
       for(int i = 0 ;i<s.length();i++){
        char ch = s.charAt(i);
          if(st.size()<part.length()){
            st.add(ch);
          }
          else{
                StringBuilder sb = new StringBuilder();
                int k = part.length();
                while(k>0){
                    sb.append(st.pop());
                    k--;
                }
                sb = sb.reverse();
             //   System.out.println(sb);
                if(!sb.toString().equals(part)){
                    int ind = 0;
                    while(k<part.length()){
                        st.add(sb.charAt(ind++));
                        k++;
                    }
                    
                }
                st.add(ch);
          }

        //  System.out.println(st + " i -> "  + i);
          
       }
            //     StringBuilder sb = new StringBuilder();
            //     int k = part.length();
            //     while(k>0){
            //         sb.append(st.pop());
            //         k--;
            //     }
            //     sb = sb.reverse();
            //   //  System.out.println(sb);
            //     if(!sb.toString().equals(part)){
            //         int ind = 0;
            //         while(k<part.length()){
            //             st.add(sb.charAt(ind++));
            //             k++;
            //         }
                    
            //     }
      // System.out.println("final stack - > " + st);
       StringBuilder ss = new StringBuilder();
       while(st.size()>0){
            ss.append(st.pop());
       }
       ss = ss.reverse();
        if(ss.length()  >= part.length()){
            String stt = ss.substring(ss.length()-part.length() , ss.length());
            if(stt.equals(part)){
                ss.delete(ss.length()-part.length() ,ss.length() );
            }
        }
       return ss.toString();
    }
}