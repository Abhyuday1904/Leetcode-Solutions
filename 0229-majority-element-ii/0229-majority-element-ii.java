class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int len = arr.length;
        int n = len/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
       //  System.out.println(map);
        for(int a : map.keySet())
        {
            if(map.get(a)>n) ans.add(a);
        }
        return ans;
    }
}