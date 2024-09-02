class Solution {
    public int chalkReplacer(int[] arr, int k) {
       long sum =0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
      //  System.out.println(sum);
        if(k == sum ) return 0;
        if(k<=sum){
            for(int i=0;i<arr.length;i++){
                if(k==0) return i;
                k = k -arr[i];
                if(k<0) return i;
            }
        }
        else if(k> sum ){
            long rem = k%sum;
          
            for(int i=0;i<arr.length;i++){
                if(rem ==0) return i;
                rem = rem - arr[i];
                if(rem <0) return i;
            }
        }
        return -1; 
    }
}