class Solution {
    public long countBadPairs(int[] arr) {
       long ans  = 0;
        long len = arr.length;
        long total = len*(len-1)/2;
        for(int i=0;i<len;i++)
        {
            arr[i] = arr[i] - i;
        }
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<len;i++)
        {
           if (!map.containsKey(arr[i])) map.put(arr[i], (long)1);
            else map.put(arr[i], map.get(arr[i]) + 1);
        }
        for(int a : map.keySet())
        {   
            long n = map.get(a);
            ans = ans+ n*(n-1)/2;
        }
        return total - ans;
    }
}