class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<words.length;i++){
            String ss = words[i];
            for(int j = 0;j<words.length;j++){
                String st = words[j];
                if(i != j){
                    if(ss.length() > st.length()){
                        if(ss.contains(st)) set.add(st);
                    }
                }
               
            }
            
        }
        for(String a : set){
            ans.add(a);
        }
         return ans;
    }
}