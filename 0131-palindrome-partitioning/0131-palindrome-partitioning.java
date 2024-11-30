class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        help(s,new ArrayList(),res);
        return res;  
        
    }
    void help(String s,List<String> curr,List<List<String>> res){
        if(s.isEmpty()){
            res.add(curr);
        }
        for(int i=1;i<=s.length();i++){
            String l=s.substring(0,i);
            String r=s.substring(i);
            if(ispalin(l)){
                List<String>dup=new ArrayList(curr);
                dup.add(l);
                help(r,dup,res);
            }
        }
    }
    boolean ispalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}