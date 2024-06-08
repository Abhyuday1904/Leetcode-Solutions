class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //nlogn
        HashSet<Integer> map = new HashSet<>();
        int prev = 0;
        int cur = 0;
        for(int i = 0; i < nums.length; i++){
            cur += nums[i];
            if(map.contains(cur % k) ){return true;}
        
            map.add(prev);
            prev = cur % k;
            
        }

        return false;
    }
}