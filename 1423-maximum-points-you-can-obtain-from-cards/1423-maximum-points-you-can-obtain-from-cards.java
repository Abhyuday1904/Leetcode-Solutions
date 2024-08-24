class Solution {
    public int maxScore(int[] arr, int k) {
        int len  = arr.length - k ;
        int i=0,j=0,summ =0,sum =0,ans =0;
        
        for(int m = 0;m<arr.length;m++){
            summ += arr[m];
        }
        if(k == arr.length) return summ;
        while(j<arr.length){
            sum += arr[j];
            int windowlen = j-i+1;
            if(windowlen<len) j++;
            if(windowlen == len){
                ans = Math.max(summ - sum,ans);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}