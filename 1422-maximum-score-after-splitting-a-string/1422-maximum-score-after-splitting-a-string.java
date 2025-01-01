class Solution {
    public int maxScore(String s) {
        int max = -2;
        for(int i=0;i<s.length()-1;i++)
        {   
            int count1 =0;
            int count2=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j) == '1') count2++;
            }
            int k=0;
            while(k<=i)
            {
                if(s.charAt(k) == '0') count1++;
                k++;
            }
            if(max<count1+count2) max = count1+count2;
        }
        return max;
    }
}