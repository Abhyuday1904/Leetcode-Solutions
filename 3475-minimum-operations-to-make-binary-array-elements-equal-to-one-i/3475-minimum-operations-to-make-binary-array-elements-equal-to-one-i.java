class Solution {
    public int minOperations(int[] arr) {
         int ans = 0;
        
        for(int i=0;i<=arr.length-3;i++){
       
            if(arr[i] == 0){
                arr[i] = 1;
                if(arr[i+1] == 0) arr[i+1] = 1;
                else arr[i+1] = 0;
                if(arr[i+2] == 0) arr[i+2] = 1;
                else arr[i+2] = 0;
                ans++;
            }
        }
        for(int i=arr.length-2;i<arr.length;i++) {
            if(arr[i] == 0) return -1;
        }
        return ans;
    }
}