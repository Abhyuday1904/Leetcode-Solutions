class Solution {
    public List<String> printVertically(String s) {
        ArrayList<String> ans =  new ArrayList<String>();
        String st[]  = s.split(" ");
        int max = 0;
        for(int i=0;i<st.length;i++){
            String ss = st[i];
            max = Math.max(ss.length(),max);
        }
        Character ch[][] = new Character[st.length][max];
        int len = st.length;
       
        for(int i=0;i<len;i++){
            String ss = st[i];
            
            for(int j=0;j<ss.length();j++){
                ch[i][j] = ss.charAt(j);
            }
        }

        // for (int i = 0; i < ch.length; i++) {
        //     for (int j = 0; j < max; j++) {
        //         System.out.print(ch[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        for(int j=0;j<max;j++){
            StringBuilder sb = new StringBuilder();
            int spaceCount = 0;
            for(int i=0;i<ch.length;i++){
                if(ch[i][j] == null){
                    spaceCount++;
                }
                else{
                    if(spaceCount>0){
                        while(spaceCount>0){
                            sb.append(" ");
                            spaceCount--;
                        }
                        sb.append(ch[i][j]);
                    }
                    else sb.append(ch[i][j]);
                }
            }
            ans.add(sb.toString());
            
        }
        return ans;
    }
}