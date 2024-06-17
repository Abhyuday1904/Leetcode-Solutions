class Solution {
    public int minimizeSum(int[] arr) {
        int len = arr.length;
        if(len == 3) return 0;
        Arrays.sort(arr);
        int score = Integer.MAX_VALUE;
        score  = Math.min(arr[len-1]-arr[2], score);
        score = Math.min(arr[len-3]-arr[0],score);
        score = Math.min(arr[len-2]- arr[1],score);
        return score;
    }
}