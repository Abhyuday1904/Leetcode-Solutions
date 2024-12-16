class Solution {
    public int[] getFinalState(int[] arr, int k, int mult) {
        while(k>0){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int i=0;i<arr.length;i++){
                if(min > arr[i]) {
                    min = arr[i];
                    idx = i;
                }
            }
            arr[idx] = arr[idx] * mult;
            k--;
        }

        return arr;
    }
}