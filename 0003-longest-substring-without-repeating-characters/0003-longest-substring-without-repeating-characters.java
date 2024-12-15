class Solution {
    public int lengthOfLongestSubstring(String s) {
      if (s.length() == 0)
            return 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            for (int j = i; j < s.length(); j++) {

                if (!map.containsKey(s.charAt(j))) {
                    max++;
                    map.put(s.charAt(j), 1);
                    ans = Math.max(ans, max);
                } else
                    break;
            }
        }
        return ans;   
    }
}