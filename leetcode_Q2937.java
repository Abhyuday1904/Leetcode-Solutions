public class leetcode_Q2937 {
    public static void main(String[] args) {
        System.out.println(findMinimumOperations("abc", "abb", "ab"));
    }
    private static int findMinimumOperations(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        int i=0;
        for(i=0;i<len1 && i<len2 && i<len3;)
        {
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i))
            {
                i++;
            }
            else break;
        }
        if(i==0) return -1;
        return len1 + len2 + len3 - 3*(i-1) - 3;
    }
}
