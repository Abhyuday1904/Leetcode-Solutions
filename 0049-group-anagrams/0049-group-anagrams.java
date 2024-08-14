class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
       HashMap<String,Integer > napp = new HashMap<>();
       HashMap<String,String> map = new HashMap<>();
        // String st[] = strs;
        int len = strs.length;
        
        for (int i = 0; i < len; i++) {
            
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);

            
           String st = new String(charArray);
           set.add(st);
           map.put(strs[i], st);
           if(!napp.containsKey(strs[i])) napp.put(strs[i],1);
           else napp.put(strs[i],napp.get(strs[i])+1);
        }

        for(String st : set){
            ArrayList<String> list = new ArrayList<>();
            for(String s : map.keySet()){
                
                if(map.get(s).equals(st)) 
                {
                    int k = napp.get(s);
                    while(k>0){
                        list.add(s);
                        k--;
                    }
                    
                }
            }
            arr.add(list);
        }
        return arr;
    }
}