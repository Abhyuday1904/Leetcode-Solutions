class Solution {
    public int[] numberGame(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int ans[] = new int[len];
        
            for(int i=1;i<len;i=i+2)
            {
                ans[i-1] = arr[i];
                ans[i] = arr[i-1];
            }
        return ans;
    }
}