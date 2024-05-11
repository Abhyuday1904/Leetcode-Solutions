import java.util.ArrayList;
import java.util.HashMap;
public class leetcode_Q2610 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(arr));
    }
    private static ArrayList<ArrayList<Integer>> findMatrix(int[] arr) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        int max  =0;
        for(int i=0;i<len;i++)
        {
            if(max<map.get(arr[i])) max = map.get(arr[i]);
        }
        System.out.println(map);
        System.out.println(max);
        while(max>0)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            for(int a : map.keySet())
            {
                if(map.get(a)>0) 
                {
                    ans.add(a);
                    map.put(a,map.get(a)-1);
                }
            }
            ar.add(ans);
            max--;
        }
        return ar;
    }
}
