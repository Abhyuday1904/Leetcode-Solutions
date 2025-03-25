class Solution {
    public int sumOfGoodNumbers(int[] arr, int k) {
        int ans = 0;
        int n = arr.length;
        for(int i =0 ;i<arr.length;i++){
            if(i-k<0 && i+k > n-1) ans += arr[i];
            else if(i-k<0){
                if(arr[i] > arr[i+k]) ans+= arr[i];
            }
            else if(i+k>n-1){
                if(arr[i]>arr[i-k]) ans += arr[i];
            }
            else{
                if(arr[i]>arr[i-k] && arr[i] > arr[i+k]) ans += arr[i];
            }
        }
        return ans;
    }
}