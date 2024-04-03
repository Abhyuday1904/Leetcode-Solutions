import java.util.Arrays;

public class leetcode_Q560 {
    public static void main(String[] args) {
        int arr[] = {-4,3,6,-2,1,-1,0,2,-2,3,1};
        System.out.println(subarraySum(arr, 5));
    }
    public static int subarraySum(int[] arr, int k) {
        int len = arr.length;
        int p[] = new int[len];
        p[0] = arr[0];
        for(int i=1;i<len;i++)
        {
            p[i] = p[i-1] + arr[i];
        } 
        int ans =0;
        System.out.println(Arrays.toString(p));
        for(int i=0;i<len-1;i++)
        {   
            if(p[i] == k) ans++;
            for(int j=i+1;j<len;j++)
            {
                if(p[j] - p[i] == k) ans++;
            }
        }
        if(p[len-1] == k) ans++;
        return ans;
    }
}
