class Solution {
    public String answerString(String s, int k) {
        if (k==1) return s;
        int max = 0;
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            max = Math.max(max , (int)ch);
        }
        char ch = (char)max;
      //  System.out.println(ch);
        if(s.length() == k) return Character.toString(ch);
        ArrayList<String> list = new ArrayList<>();
        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ch){
                if(i>=k-1){
                    list.add(s.substring(i , s.length()));
                   // return s.substring(i , s.length());
                }
                else{
                    list.add(s.substring(i , s.length() - (k-i-1)));
                   // return s.substring(i , s.length() - (k-i-1));
                }
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}