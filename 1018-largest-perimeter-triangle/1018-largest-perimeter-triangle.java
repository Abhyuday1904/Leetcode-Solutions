class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr); 
        int a=0;
        int b =0 ;
        int c= 0;
        for(int i=arr.length-1; i>=2; i--){
            c = arr[i];
            a = arr[i-1];
            b = arr[i-2];
            if(a+b > c){
                return a+b+c;
            }
        }
        return 0;
    }
}