class Solution {
    public List<String> stringSequence(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append('a');
            ans.add(sb.toString());
            if(s.charAt(i)!= sb.charAt(sb.length() - 1)){
                    while(s.charAt(i)!= sb.charAt(sb.length() - 1)){
                //System.out.println("before ->" + sb);
                char ch = sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                sb.append((char) (ch  + 1));
                ans.add(sb.toString());
                //System.out.println(ans);
                 //System.out.println("after ->" + sb);
            }
            
            }
            
        }
        return ans;
    }
}