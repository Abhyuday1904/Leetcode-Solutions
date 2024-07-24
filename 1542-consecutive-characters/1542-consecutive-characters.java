class Solution {
    public int maxPower(String s) {
        int ans =0;
        
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            int curr =0;
            int j=i+1;
            while(j<s.length() && s.charAt(j) == ch){
                curr++;
                j++;
            }
            ans = Math.max(ans,curr);
            // System.out.println(i);
        }
        return ans+1;
    }
}