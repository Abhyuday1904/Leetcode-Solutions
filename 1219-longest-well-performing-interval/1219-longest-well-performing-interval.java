class Solution {
    public int longestWPI(int[] arr) {
        if(arr.length == 1){
            if(arr[0]>8) return 1;
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>8){
                arr[i] = 1;
            }
            else arr[i] = 0;
        }
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>= ((i+1)/2+1)){
                max = Math.max(max, i+1);
               
                
            }
            else{
                for(int j=0;j<i;j++){
                    int len  = i-j;
                    int req = len/2+1;
                    if(arr[i] - arr[j] >= req){
                        max = Math.max(max, len);
                    }
                }
            }
        }

        return max;
    }
}