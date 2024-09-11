class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char s[] = s1.toCharArray();
        char t[] = s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        int a =0;
        // System.out.println(Arrays.toString(s));
        // System.out.println(Arrays.toString(t));
        for(int i=0;i<s1.length();i++){
            if(s[i] > t[i]){
                a = 0;
                break;
            }
            else if(s[i] < t[i]){
                a = 1;
                break;
            }
        }
        if(a == 0){
            for(int i=0;i<s1.length();i++){
            int c = s[i];
            int b = t[i];
            if(c<b) return false;
           }
        }
        else {
                 for(int i=0;i<s1.length();i++){
            int c = s[i];
            int b = t[i];
            if(b<c) return false;
           }      
        }    
        return true;
    }
}