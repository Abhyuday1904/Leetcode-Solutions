class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int ans = 0 ;
       
        for(int i=arr[arr.length-1];i>=0;i--){
            
            int count  =0;
            for(int j=arr.length-1;j>=0;j--){
                System.out.println(arr[j] + "  " + i);
                if(arr[j] >= i ){
                    count++;
                }
            }
            if(count>=i){
                ans = Math.max(ans,i);
                break;
            }
        }
        return ans;
    }
}