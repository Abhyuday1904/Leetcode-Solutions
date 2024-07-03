class Solution {
    public int minDifference(int[] arr) {
        int len = arr.length;
        if(len<5) return 0;
        Arrays.sort(arr);
        int min1 = Math.min((arr[len-3] - arr[1]), arr[len-2] - arr[2]);
        int min2 =  Math.min((arr[len-1] - arr[3]) , arr[len-4]  - arr[0]);
        return Math.min(min1,min2);
    }
}