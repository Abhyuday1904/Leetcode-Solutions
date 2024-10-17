class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        double averages[] = new double[arr.length/2];
        int idx = 0;
        for(int i = 0 ,j = arr.length-1;i<arr.length/2;i++ , j--){
            averages[idx++] = (double)(arr[i]+arr[j])/2;
        }
        double min  = 51;
        for(int i =0 ;i<averages.length;i++){
            if(min > averages[i]) min  = averages[i];
        }
        return min;
    }
}