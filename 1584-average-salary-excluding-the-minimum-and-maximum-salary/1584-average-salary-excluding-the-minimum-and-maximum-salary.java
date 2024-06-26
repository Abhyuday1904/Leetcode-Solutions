class Solution {
    public double average(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }
       
        int count =0;
        double sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min && arr[i]!=max) {
                sum+=arr[i];
            }
           
        }
        double average = sum/(arr.length-2);
        return average;
    }
}