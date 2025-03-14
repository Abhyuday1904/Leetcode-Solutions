class Solution {
    public int maxProduct(int[] arr) {
        int ans = arr[0];
        for(int i =0 ;i<arr.length;i++){
            int prod = 1;
            for(int j = i;j<arr.length;j++){
                prod = prod*arr[j];
                ans = Math.max(ans , prod);
                //System.out.println(prod);
            }
           
        }
        return ans;
    }
}