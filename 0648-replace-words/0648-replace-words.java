class Solution {
    public String replaceWords(List<String> arr, String s) {
        String st[] = s.split(" ");
        String ans = "";
        for(int i=0;i<arr.size();i++)
        {
            for(int j =0;j<st.length;j++)
            {   
                String ss = st[j];
                if(ss.startsWith(arr.get(i)))
                {
                    st[j] = arr.get(i);
                }
            }
        }
        ans = ans + st[0];
        for(int i=1;i<st.length;i++)
        {
            ans = ans + " " + st[i];
        }
      return ans;
    }
}