class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length == 1) return true;
        if(arr[0] == 0 ) return false;
        for(int i=0;i<=arr.length;i++){
            if(i == arr.length) return true;
            if(i<arr.length){
                if(arr[i] == 0) break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int j = i-1;j>= -1;j--){

                    if(j == -1) return false;
                    if(arr[j]>(i-j)){
                        break;
                    }
                }
            }
        }
        return true;
    }
}