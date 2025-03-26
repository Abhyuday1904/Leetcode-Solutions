class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if(s.length() == 1) return true;
    
        for(int i = 0 ; i<=s.length()-k;i++){
            String t = s.substring(i , i+k);
            if(k == s.length()){
                return check(t);
            }

            if(check(t)){
                char ch = t.charAt(0);
            if(i == 0){
                int right = k  ;
                if(s.charAt(right)  != ch) return true;
            }
            else if(i==s.length()-k){
                int left = i-1;
                if(s.charAt(left) != ch) return true;
            }
            else{
                int left = i-1;
                int right = i+k;
                if(s.charAt(left)!= ch && s.charAt(right)!=ch) return true;
            }
                
            }
        }
        return false;
    }
    private boolean check(String t ){
         char ch = t.charAt(0);
         for(int i = 1 ; i<t.length();i++){
            if(t.charAt(i) != ch) return false;
         }
         return true;
    }
}