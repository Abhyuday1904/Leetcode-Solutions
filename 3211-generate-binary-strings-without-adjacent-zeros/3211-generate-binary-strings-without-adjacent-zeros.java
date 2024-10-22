class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        if(n == 1){
            ans.add("0");
            ans.add("1");
            return ans;
        }
        if(n == 2){
            ans.add("01");
            ans.add("11");
            ans.add("10");
            return ans;
        }
        solve(ans , "" , n , n);
        return ans;
    }
    void solve(List<String> ans, String out , int n , int i ){
        if(i == 0){
            ans.add(out);
            return ;
        }
        if(i == n ){
            solve(ans , out + "0" , n , i-1);
            solve(ans  , out + "1",  n , i-1);
        }
        else{
            if(out.charAt(out.length() - 1) == '0'){
                solve(ans  , out + "1",  n , i-1);
            }
            else
            {
                 solve(ans , out + "0" , n , i-1);
                 solve(ans  , out + "1",  n , i-1);
            }
        }
        
    }
}