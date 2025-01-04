class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
       int ans = 0;
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size() == s.length()) return 0;
        for(Character ch : set){
            int first = 0;
            int last = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ch) {
                    first = i;
                    break;
                }
            }
            for(int i = s.length() -1 ;i>=0;i--){
                if(s.charAt(i) == ch) {
                    last = i;
                    break;
                }
            }
            HashSet<Character> sett = new HashSet<>();
            for(int i = first+1;i<last;i++){
                sett.add(s.charAt(i));
            }
            ans += sett.size();
        }
        return ans;
    }
    
}