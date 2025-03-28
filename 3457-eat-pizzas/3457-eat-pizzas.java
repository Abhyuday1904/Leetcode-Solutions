class Solution {
    public long maxWeight(int[] arr) {
        int k = arr.length/4;
        long ans = 0;
        Arrays.sort(arr);
        int i = arr.length-1;
        if(k == 1) return arr[i];
        int odd = 0;
        int even= 0;
        if(k%2==0) {
            odd = k/2;
            even = k/2;
        }
        else{
            odd = k/2 + 1;
            even = k/2;
        }
        while(odd>0){
            ans+= arr[i--];
            odd--;
        }
        i--;
        while(even > 0){
            ans += arr[i];
            i = i-2;
            even --;
        }
       
        return ans;
    }
}