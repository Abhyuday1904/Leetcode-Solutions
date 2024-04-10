import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_Q950 {
    public static void main(String[] args) {
        int arr[] = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(arr)));
    }
    public static int[] deckRevealedIncreasing(int[] arr) {
        int len = arr.length;
        if(len == 1 ) return arr;
       Arrays.sort(arr);
       Queue<Integer> q = new LinkedList<>();
       q.add(arr[len-1]);
       int i=2;
       while(q.size()<=len)
       {
           int a = q.remove();
           q.add(a);
           q.add(arr[len-i]);
           i++;
           if(i>len) break;
       }
       for(int j=len-1;j>=0;j--)
       {
           arr[j] = q.remove();
       }
       return  arr;
    }
}
