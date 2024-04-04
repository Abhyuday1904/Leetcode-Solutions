public class leetcode_Q1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public static int maxDepth(String s) {
        int ans =0;
        int count =0;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            else if(s.charAt(i) == ')') count--;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
