class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==  0) return 0;
        int i =0;
        int j =0;
        int ans = 0 ; 
        HashMap<Character , Integer> set = new HashMap<>();
        while(j<s.length()){
            if(!set.containsKey(s.charAt(j))){
                set.put(s.charAt(j) , 1 );
                ans = Math.max(ans , j-i+1);
                j++;
            }
            else {
                while(i<s.length()){
                    if(s.charAt(i)!=s.charAt(j)){
                        set.remove(s.charAt(i));
                        i++;
                    }
                    else {
                        i++;
                        set.remove(s.charAt(j));
                        break;
                    }  
                }
                ans = Math.max(ans , j-i+1);
            }
        }
        return ans;
    }
}