class Solution {
    public int characterReplacement(String s, int k) {
        // if(s.length()%2 == 0) {
        //         if(k >= s.length()/2 ) return s.length();
        // }
        // else {
        //     if(k>= s.length()/2 +1) return s.length();
        // }
        int ans =0;
        int i=0;
        int j=0;
        int max  = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            
            char ch = s.charAt(j);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch , map.get(ch)+1);
            max = Math.max(max , map.get(ch));
            if(k > ((j-i+1) - max)){
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else if(k == ((j-i+1) - max)){
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else{
                while(k < ((j-i+1) - max)){
                    if(map.get(s.charAt(i)) > 1 ) map.put(s.charAt(i) , map.get(s.charAt(i)) -1 );
                    else map.remove(s.charAt(i)); 
                    i++ ; 
                }
                j++;
            }

        }
        return ans;
    }
}