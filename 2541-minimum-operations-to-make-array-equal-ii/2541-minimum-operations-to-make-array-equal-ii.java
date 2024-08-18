class Solution {
    public long minOperations(int[] arr1, int[] arr2, int k) {
        if(Arrays.equals(arr1, arr2)) return 0;
        if(k == 0) return -1;
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%k != arr2[i]%k) return -1;
        } 
        long increment = 0;
        long decrement = 0;
        for(int i=0 ; i<arr1.length;i++){
            if(arr1[i]>arr2[i]){
                decrement += (arr1[i] - arr2[i]);
            }
            else{
                increment += (arr2[i] - arr1[i]) ;
            }

        }
        if(increment!=decrement) return -1;
        return increment/k;
    }
}