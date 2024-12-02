class Solution {
    public int longestContinuousSubstring(String s) {
       
        int max = 1;
        for(int i =0 ;i<s.length()-1;){
            int numb = (int)(s.charAt(i));
            int nextnumb = (int)(s.charAt(i+1));
            if((int)(s.charAt(i)) + 1 == (int)(s.charAt(i+1))){
                int count = 2;
               while(i<s.length()-1 && ((int)(s.charAt(i)) + 1 == (int)(s.charAt(i+1)))){
                    max = Math.max(max , count);
                    count++;
                    i++;
               }
            }
            else i++;
        }
        return max;
    }
}