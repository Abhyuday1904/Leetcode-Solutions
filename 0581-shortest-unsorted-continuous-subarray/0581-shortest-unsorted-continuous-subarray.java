class Solution {
    public int findUnsortedSubarray(int[] arr) {
      int a[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int min=-1;
        int max =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=a[i]){
                min = i;
                break;
            }
        }
        if(min == -1) return 0;
        for(int j = arr.length-1;j>=0;j--){
                if(arr[j] != a[j]){
                    max = j;
                    break;
                }
        }
        return max - min +1;  
    }
}