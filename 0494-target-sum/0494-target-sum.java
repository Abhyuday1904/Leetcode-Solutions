class Solution {
    public int findTargetSumWays(int[] arr, int target) {
       return solve(arr , target , 0 , 0);
    }
   public static int solve(int arr[] , int target , int sum , int ind){
    if(ind == arr.length){
        if(target == sum ) return 1;
      else return 0;
    }
      int add = solve(arr , target , sum + arr[ind] , ind+1);
      int neg = solve(arr , target , sum - arr[ind] , ind+1);

      return add + neg;
   }
}