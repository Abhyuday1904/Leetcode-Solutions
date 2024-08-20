class Solution {
    public int beautySum(String s) {
         
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                Character ch = s.charAt(j);
                if (!map.containsKey(ch))
                    map.put(ch, 1);
                else
                   {
                    map.put(ch, map.get(ch) + 1);       
                   }
                   int max = -1;
                   int min = Integer.MAX_VALUE;

                   for (Character chh : map.keySet()) {
                    max = Math.max(max, map.get(chh));
                    min = Math.min(map.get(chh), min);
                }
                ans += max - min;
               
            }
        }

        return ans;
    }
}