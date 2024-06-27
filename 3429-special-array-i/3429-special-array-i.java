class Solution {
    public boolean isArraySpecial(int[] arr) {
        if(arr.length<=1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==arr[i+1]%2){
                return false;
            }
           
        }
        return true;
    }
}