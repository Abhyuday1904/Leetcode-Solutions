class Solution {
    public long maximumTotalSum(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        long ans = arr[arr.length -1];
        for(int i = arr.length - 2 ;i>=0;i--){
            if(arr[i] == 1 && i!=0) return -1;
            if(arr[i] >= arr[i+1]){
                arr[i] = arr[i+1]  -1;
                if(arr[i] == 0) return -1;
                ans += arr[i];
                
            }
            else{
                ans += arr[i];
            }
       //   System.out.println(Arrays.toString(arr));

        }
    return ans;
       }
}