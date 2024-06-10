class Solution {
    public int heightChecker(int[] arr) {
      
        int brr[] = new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
      int count = 0 ;
       for(int k=0;k<arr.length;k++)
        {
            if(arr[k] != brr[k])
            {
                count++;
            }
        }
        return count;
    }
}