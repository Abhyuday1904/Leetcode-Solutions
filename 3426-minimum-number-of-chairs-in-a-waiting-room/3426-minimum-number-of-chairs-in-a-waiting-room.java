class Solution {
    public int minimumChairs(String s) {
        int ans =0;
        int curr =0;
        if(s.length() == 1){
            
            return 1;
        }
        else{
            ans++;
            curr++;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == 'E'){
                curr++;
            }
            else if(s.charAt(i) == 'L'){
                curr--;
            }
            if(curr>ans) ans++;
        }
        return ans;
    }
}