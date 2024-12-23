class Solution {
    public int minimumRounds(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) +1);
        }
        int ans =0 ;
        for(int a : map.keySet()){
            int count = map.get(a);
            if(count == 1) return -1;
            else {
                if(count%3 == 0) ans += count/3;
                if(count%3 == 1 ) ans += (count-4)/3 + 2;
                if(count%3 == 2 ) ans += (count-2)/3 + 1;
            }
        }
        return ans;
    }
}