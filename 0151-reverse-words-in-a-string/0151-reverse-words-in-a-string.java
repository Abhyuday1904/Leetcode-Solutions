class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> ss = new ArrayList<>();
        for(int i=0;i<s.length();){
            if(s.charAt(i)!= ' '){
                StringBuilder sb = new StringBuilder();
                while(i<s.length() && s.charAt(i) != ' '){
                    sb.append(s.charAt(i));
                    i++;
                }
                ss.add(sb.toString());
                sb.delete(0 , sb.length());
            }
            else{
                i++;
            }
        }
        // System.out.println(ss +"size -> " + ss.size());
        s = "";
        for(int i = ss.size() -1 ;i>=0 ; i--){
            s = s + ss.get(i);
            s = s + " ";
          
        }
        s = s.trim();
        return s;
    }
}