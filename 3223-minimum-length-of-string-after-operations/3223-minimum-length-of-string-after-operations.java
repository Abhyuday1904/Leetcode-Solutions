class Solution {
    public int minimumLength(String s) {
        if(s.length()<3) return s.length();
        int ans =0;
        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(char ch : map.keySet()){
            if(map.get(ch)%2 == 0){
                ans +=2;
            }
            else ans++;
        }
        return ans;
    }
}