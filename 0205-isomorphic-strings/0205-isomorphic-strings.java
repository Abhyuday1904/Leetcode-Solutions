class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            
            if(map.containsKey(ch))
            {
              if(map.get(ch) != t.charAt(i))
              {
                return false;
              }
            }
            else if(map.containsValue(t.charAt(i)))
              {
                return false;
              }
             else if(!map.containsKey(ch))
            {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}