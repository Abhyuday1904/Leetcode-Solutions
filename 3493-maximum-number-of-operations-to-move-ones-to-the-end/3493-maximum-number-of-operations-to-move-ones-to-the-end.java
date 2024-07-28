class Solution {
    public int maxOperations(String s) {
        int ans =0;
        int count  =0;
        if(s.charAt(s.length()-1) == '0'){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == '1')count++;
                if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                    ans += count;
                }
            }
            ans += count;
        }
        else {
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == '1')count++;
                if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                    ans += count;
                }
            }
        }
        
        return ans;
    }
}