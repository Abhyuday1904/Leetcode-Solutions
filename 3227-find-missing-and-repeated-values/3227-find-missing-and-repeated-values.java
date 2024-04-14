class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        int n = grid.length;
        int len = n*n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int a = grid[i][j];
                if(!map.containsKey(a)) map.put(a,1);
                else map.put(a,map.get(a)+1); 
            }
        }
        for(int i=1;i<=len;i++)
        {
           if (!map.containsKey(i)) {
                ans[1] = i; 
            } else if (map.get(i) == 2) {
                ans[0] = i; 
            }
        }
        return ans;
    }
}