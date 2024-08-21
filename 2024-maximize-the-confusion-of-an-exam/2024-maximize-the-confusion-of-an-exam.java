class Solution {
    public int maxConsecutiveAnswers(String st, int k) {
        if(st.length() <= 2*k) return st.length();
        int ans = 0 , i = 0 , j=0;
        int f = 0;
        for(int m=0;m<st.length();m++){
            if(st.charAt(m) == 'F'){
                f++;
            }
        }
        if(f<=k) return st.length();
        if(st.length() - f <= k) return st.length();
        f = 0;
        while(j<st.length()){

           // System.out.println( "before -> " + i + ","  + j  + " -> " + f);
            if(st.charAt(j) == 'F'){
                f++;
            }
            if(f<k){
                j++;
            }
            else if( f  == k){
                ans = Math.max(ans , j-i+1);
                j++;
            }
            else {
                while(f>k){
                    if(st.charAt(i) == 'F') f--;
                    i++;
                }
                
                if(f == k){
                    ans  = Math.max(ans, j-i+1);
                }
                j++;
            }
         //   System.out.println(i + ","  + j  + " -> " + f);
            
        }

         i=0;
        j=0;
        int t = 0;
        while(j<st.length()){

            // System.out.println( "before -> " + i + ","  + j  + " -> " + f);
             if(st.charAt(j) == 'T'){
                 t++;
             }
             if(t<k){
                 j++;
             }
             else if( t  == k){
                 ans = Math.max(ans , j-i+1);
                 j++;
             }
             else {
                 while(t>k){
                     if(st.charAt(i) == 'T') t--;
                     i++;
                 }
                 
                 if(t == k){
                     ans  = Math.max(ans, j-i+1);
                 }
                 j++;
             }
          //   System.out.println(i + ","  + j  + " -> " + f);
             
         }
        return ans;
    }
}