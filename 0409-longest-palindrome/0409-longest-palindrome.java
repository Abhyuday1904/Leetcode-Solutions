class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        if(map.size() == 1) return s.length();
     //   System.out.println(map);
        int max =0;
        for(Character ch : map.keySet())
        {   
            int count = map.get(ch);
            if(count%2==0) max =  max + count;
            else if(count%2==1 && count>1) 
            {
                max = max + count-1;
            }
            
        }
     //   System.out.println(max);
        for(Character ch : map.keySet())
        {
            if(map.get(ch)%2 == 1){
                max++;
                break;
            }
            
            
        }

        return max; 
    }
}