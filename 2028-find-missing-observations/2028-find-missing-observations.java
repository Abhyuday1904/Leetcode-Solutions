class Solution {
    public int[] missingRolls(int[] arr, int mean, int n) {
        int ans[] = new int[n];
        int fail[] = new int[0];
        int sum = 0 ; 
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int wantedSum = mean*(n+arr.length) - sum;
        if(wantedSum > n*6) return fail;
        else if(wantedSum<n) return fail;
        else{
            int k = n;
            int idx = 0;
            while(k>0){
                if(wantedSum - k >=5) {
                    ans[idx++] = 6;
                    wantedSum -= 6;
                }
                else if(wantedSum - k >=4) {
                    ans[idx++] = 5;
                    wantedSum -= 5;
                }
                else if(wantedSum - k >=3) {
                    ans[idx++] = 4;
                    wantedSum -= 4;
                }
                else if(wantedSum - k >=2) {
                    ans[idx++] = 3;
                    wantedSum -= 3;
                }
                else if(wantedSum - k >=1) {
                    ans[idx++] = 2;
                    wantedSum -= 2;
                }
                else if(wantedSum - k >=0) {
                    ans[idx++] = 1;
                    wantedSum--;
                }
                k--;
                
            }
        }
        return ans;
    }
}