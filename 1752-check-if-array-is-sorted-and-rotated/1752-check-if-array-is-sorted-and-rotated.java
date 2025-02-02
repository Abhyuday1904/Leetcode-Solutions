class Solution {
    public boolean check(int[] arr) {
       int count = 0 ;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1] < arr[i]) count++;
        }
        if(count == 0) return true;
        if(arr[arr.length-1] > arr[0]) return false;
        return count<=1; 
    }
}