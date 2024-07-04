class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int ans[]=new int[n+1];

        int num=n;
        int num2=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                ans[i]=num;
                num--;
            }
            else{
                ans[i]=num2;
                num2++; 
            }
        }
        ans[n]=num;
        
        return ans;
    }
}