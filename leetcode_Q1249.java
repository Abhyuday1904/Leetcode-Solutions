public class leetcode_Q1249 {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("))(("));
    }
    public static String minRemoveToMakeValid(String s) {
        int count1 =0;
        int len = s.length();
        int count2 =0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<len;i++)
        {
            if(s.charAt(i) == '(') count1++;
            else if(s.charAt(i) == ')') count2++;
            if(count1<count2) 
            {
                count2--;
            }
            else sb.append(s.charAt(i));
        }
        count1 =0;
        count2 =0;
        int len1 = sb.length();
        String st  = sb.toString();
        sb.setLength(0);
        // System.out.println(st);
        for(int i=len1-1;i>=0;i--)
        {
            if(st.charAt(i) == '(') count1++;
            else if(st.charAt(i) == ')') count2++;
            if(count1>count2) 
            {
                count1--;
            }
            else sb.append(st.charAt(i));
        }
        System.out.println(sb);
        
        return sb.reverse().toString();
    }
}
