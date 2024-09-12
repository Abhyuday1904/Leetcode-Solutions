class Solution {
    public int countConsistentStrings(String allowed, String[] words)   {
        int ans = 0 ; 
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            if(set.add(ch));
        }
        for(int j=0;j<words.length;j++){
            String s = words[j];
            int i=0 ;
            for(;i<s.length();i++ ){
                if(!set.contains(s.charAt(i)) ){
                    break;
                } 
            }
            if(i>=s.length()) ans++;
        }
        return ans;
    }
}