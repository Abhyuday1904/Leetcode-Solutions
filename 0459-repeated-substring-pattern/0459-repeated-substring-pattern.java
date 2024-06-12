class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
            for(int i=0;i<len/2;i++){
                sb.append(s.substring(0, i+1));
               // System.out.println(sb);
                String st = sb.toString();
              //  System.out.println(sb.length());
                if(len%sb.length()==0){
                    int k = len/sb.length();
                    while(k>1){
                        sb.append(st);
                        k--;
                    }
                    // System.out.println();
                    // System.out.println(sb);
                    // System.out.println();
                    // System.out.println();
                    if(sb.toString().equals(s)) return true;
                }
                
                sb.delete(0, sb.length());
            }
        
        return false;
    }
}