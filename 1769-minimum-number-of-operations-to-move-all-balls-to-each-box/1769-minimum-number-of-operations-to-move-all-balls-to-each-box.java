class Solution {
    public int[] minOperations(String s) {
      int arr[] = new int[s.length()] ;
        String arr1[] = s.split("");
         for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(arr1[i]);
        }
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int count = 0 ;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=0) 
                {
                    if(j>i) count = count + j-i;
                    else count = count + i-j;
                }
            }
            //System.out.println(count);
            ans[i] = count;
        }
        return ans;  
    }
}