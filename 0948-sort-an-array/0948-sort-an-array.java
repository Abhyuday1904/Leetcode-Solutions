class Solution {
   public  int[] sortArray(int[] arr){
       if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int left[] = Arrays.copyOfRange(arr, 0, mid);
        int right[] = Arrays.copyOfRange(arr, mid, arr.length);
        Arrays.sort(left);
        Arrays.sort(right);
        int mix[] = new int[left.length+right.length];
        int i =0 ;
        int j =0 ;
        int k=0  ;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k] = left[i];
                i++;
                k++;
            }
            else
            {
                mix[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}