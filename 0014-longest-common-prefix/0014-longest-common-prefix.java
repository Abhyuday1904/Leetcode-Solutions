class Solution {
    public String longestCommonPrefix(String[] s) {
        String stt = "";
        int len=Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()<len) len = s[i].length();
        }
        for(int i=0;i<len;i++)
        {
            char ch = s[0].charAt(i);
            for(int j=0;j<s.length;j++)
            {
                if(ch!=s[j].charAt(i))
                {
                    return stt;
                }
            }
            stt = stt+ch;
        }
        return stt;
    }
}