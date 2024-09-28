class Solution {
    public int maxArea(int[] arr) {
       int max = 0;
        int currmax  = 0;
        for(int i=0, j =arr.length-1;i<j;)
        {
            if(arr[i]<arr[j])
            {
                currmax = arr[i]*(j-i);
                if(max<currmax) max = currmax;
                i++;
            }
            else 
            {
                currmax = arr[j]*(j-i);
                if(max<currmax) max = currmax;
                j--;
            }
        }
        return max;
    }
}