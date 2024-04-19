class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length();
        
        int count =0;
        for(int i=0;i<len;)
        {
            if(s.charAt(i) != ' ')
            {
               // ans = ans + s.charAt(i);
                i++;
            }
            else 
            {   
                
                while(s.charAt(i) == ' ')
                {
                    i++;
                }
              //  ans =  ans + " "; 
                count++;
            }
            
        }
        String ans = "";
      //  System.out.println(count);
        String st[] = new String[count+1];
        int idx =0;
        for(int i=0;i<len;)
        {
            if(s.charAt(i) != ' ')
            {
                ans = ans + s.charAt(i);
                i++;
            }
            else 
            {   
                
                while(s.charAt(i) == ' ')
                {
                    i++;
                }
                st[idx] = ans;
            idx++;
            ans ="";
            }
        }
        st[count] = ans;
       //  System.out.println(Arrays.toString(st));
         StringBuilder sb = new StringBuilder();
        for(int i = count;i>=1;i--)
        {
            sb  = sb.append(st[i]);
            sb.append(" ");
        }
        sb.append(st[0]);
        return sb.toString();
    }
}