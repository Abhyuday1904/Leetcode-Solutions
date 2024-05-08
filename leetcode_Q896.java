public class leetcode_Q896 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        System.out.println(isMonotonic(arr));
    }
    private static boolean isMonotonic(int[] arr) {
        int len =arr.length;
        if(arr[0]>arr[len-1])
        {
            for(int i=0;i<len-1;i++)
            {
                if(arr[i]<arr[i+1]) return false;
            }
            return true;
        }
        else if(arr[0]<arr[len-1])
        {
            for(int i=0;i<len-1;i++)
            {
                if(arr[i]>arr[i+1]) return false;
            }
            return true;
        }
        else 
        {
            for(int i=0;i<len-1;i++)
            {
                if(arr[i]!=arr[i+1]) return false;
            }
            return true;
        }
    }
}
