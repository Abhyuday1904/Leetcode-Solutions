class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int len1 = words.size();
        int len2 = s.length();
        if(len1!=len2) return false;
        String ss = "";
        for(int i=0;i<len1;i++)
        {   
            String st = words.get(i);
            ss = ss + st.charAt(0);
        }
        if(s.equals(ss)) return true;
        return false;
    }
}