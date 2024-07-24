class Solution {
    public int maxPower(String s) {
       int ans =0;
        int curr =0;
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            if(s.charAt(i+1) == ch){
                curr++;
            }
            else {
                curr = 0;
            }
            ans = Math.max(ans,curr);
        }
        return ans+1;
    }
}