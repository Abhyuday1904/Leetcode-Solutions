class Solution {
    public int lengthOfLastWord(String s) {
        int ans =0 ;
        for(int i = s.length()-1 ; i>=0 ;){
            
            if(s.charAt(i) == ' ') {
                i--;
            }
            else {
                while(i>=0 && s.charAt(i) != ' '){
                    ans++;
                    i--;
                }
                return ans;
            }
        }
         return ans;
    }
   
}