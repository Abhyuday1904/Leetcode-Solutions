class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        int len = names.length;
        for(int i=0;i<len;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=len-1,j=0;i>=0;i--,j++)
        {
            names[j] = map.get(heights[i]);
        }
        return names;
    }
}