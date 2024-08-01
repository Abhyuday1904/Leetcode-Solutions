class Solution {
    public int minimumSum(int[] arr) {
       int n = arr.length;
            int[] minLeft = new int[n];
            int[] minRight = new int[n];
            
            for(int i=0; i<n; i++) {
                if(i == 0)
                    minLeft[i] = arr[i];
                else
                    minLeft[i] = Math.min(minLeft[i-1], arr[i-1]);
            }
            
            for(int i=n-1; i>=0; i--) {
                if(i == n-1)
                    minRight[i] = arr[i];
                else
                    minRight[i] = Math.min(minRight[i+1], arr[i+1]);
            }
            
            int sum = Integer.MAX_VALUE;
            for(int i= 1; i<n-1; i++) {
                if(arr[i] > minLeft[i] && arr[i] > minRight[i]) {
                    // System.out.println("i: " + i + ", num: " + nums[i] + ", left: " + minLeft[i] + ", right: " + minRight[i]);
                    sum = Math.min(sum, arr[i] + minLeft[i] + minRight[i]);
                }
            }
            
            return sum == Integer.MAX_VALUE ? -1 : sum; 
    }
}