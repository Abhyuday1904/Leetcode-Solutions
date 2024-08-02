class Solution {
    public int countTestedDevices(int[] arr) {
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]-ans >0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}