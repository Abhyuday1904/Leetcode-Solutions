class Solution {
    public long maximumTripletValue(int[]  arr) {
        long  ans = 0;
        int n  = arr.length;
        int b[] = new int[n];
        int c[] = new int[n];
        int maxLeft = arr[0];
        int maxRight = arr[n-1];
        b[0] = -1;
        b[n-1] = -1;
        c[0] = -1;
        c[n-1] = -1;
        for(int i = 1 ; i < n-1; i++ ){
            if(maxLeft > arr[i]) b[i] = maxLeft;
            else{
                b[i] = -1;
                maxLeft = arr[i];
            }
        }
     //   System.out.println(Arrays.toString(b));
        for(int i = n-2;i>=1;i--){
            if(maxRight >= arr[i]){
                c[i] = maxRight;
            }
            else{
                c[i] = maxRight;
                maxRight = arr[i];
            }
        }
     //   System.out.println(Arrays.toString(c));
        for(int j = 1 ; j <= n-2 ; j++){
            if(b[j] == -1 || c[j] == -1) continue;
            else{
               // System.out.println("Hii");
                long cal =(long) (b[j] - arr[j])* c[j];
               // System.out.println(cal);
                if(ans<cal){
                    ans =  cal;
                }
                
            }
        }
        return ans;
    }
}