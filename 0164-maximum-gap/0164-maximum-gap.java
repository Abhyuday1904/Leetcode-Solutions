class Solution {
    public int maximumGap(int[] arr) {
        int n = arr.length;
        int maxGap = 0;
        int min  = Integer.MAX_VALUE;
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(arr[i] , min);
            max = Math.max(arr[i] , max);
        }
        int bucketSize = (int)Math.ceil((double)(max - min )/(n-1));
        int minBucket[] = new int[n-1];
        int maxBucket[] = new int[n-1];
        Arrays.fill(minBucket , Integer.MAX_VALUE);
        Arrays.fill(maxBucket , -1);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == min || arr[i] == max) continue;
            int bucketIdx = (arr[i] - min)/bucketSize;
            minBucket[bucketIdx] = Math.min(minBucket[bucketIdx] , arr[i]);
            maxBucket[bucketIdx] = Math.max(maxBucket[bucketIdx] , arr[i]);
        }
        for(int i = 0;i<n-1;i++){
            if(maxBucket[i] == -1) continue;
            maxGap = Math.max(minBucket[i] - min , maxGap);
            min = maxBucket[i]; 
        }
       
        maxGap = Math.max(maxGap , max- min);
        return maxGap;
    }
}