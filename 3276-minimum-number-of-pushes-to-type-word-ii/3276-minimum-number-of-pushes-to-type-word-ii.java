class Solution {
    public int minimumPushes(String s) {
        HashMap<Character,Integer> map   = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
        }
        if(map.size()<=8) return s.length();
        HashMap<Character,Integer> m = sortByValue(map);
        int ans =0;
        int k = map.size();
        for(int a : m.values()){
            if(k<=8){
                ans += a;
            }
            else if(k>8 && k<=16){
                ans+=a*2;
            }
            else if(k>16 && k<=24){
                ans += a*3;
            }
            else {
                ans += a*4;
            }
            
           k--;
        }
        return ans;
    }
    public static HashMap<Character, Integer>
    sortByValue(HashMap<Character, Integer> hm)
    {
        HashMap<Character, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
 
        return temp;
    }
}