class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        
        for(;left<right;left++,right--)
        {   
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}