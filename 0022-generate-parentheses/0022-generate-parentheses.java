class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n , n , n , "" , ans);
        return ans;
    }
    private static void solve(int n  , int open , int close , String curr , List<String> ans){
        if(open == 0 && close ==0){
            ans.add(curr);
            return;
        }
      //  System.out.println(curr );
        if(open == close){
            solve(n, open-1, close, curr + "(",ans);
        }
        else if(open<close ) {
            if(open==0){
                solve(n, open, close-1, curr + ")",ans);
            }
            else if(open>0){
                solve(n, open-1, close, curr + "(",ans);
            solve(n, open, close-1, curr + ")",ans);
            }

        }
        
        return ;
    }
}