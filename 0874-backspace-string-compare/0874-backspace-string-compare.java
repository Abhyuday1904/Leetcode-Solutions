class Solution {
    public boolean backspaceCompare(String s, String t) {
     StringBuilder ss = new StringBuilder();
        StringBuilder st = new StringBuilder();
        int len1 = s.length();
        int len2 =  t.length();
        for(int i=0;i<len1;i++)
        {
            if(s.charAt(i) == '#')
            {   
                if(!ss.isEmpty())
                ss.deleteCharAt(ss.length()-1);
            }
            else ss.append(s.charAt(i));
            
        }
        for(int i=0;i<len2;i++)
        {
            if(t.charAt(i) == '#')
            {   if(!st.isEmpty())
                st.deleteCharAt(st.length()-1);
            }
            else st.append(t.charAt(i));
        }
        if(ss.toString().equals(st.toString())) return true;
        return false; 
    }
}