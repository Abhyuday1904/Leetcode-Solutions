class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a , 0) + 1);
        }
        int idx = 1;
        for(int num : map.keySet()){
            map.put(num , idx++);
        }
        int ans[]  = new int[arr.length];
        for(int i=0;i<arr.length ;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}