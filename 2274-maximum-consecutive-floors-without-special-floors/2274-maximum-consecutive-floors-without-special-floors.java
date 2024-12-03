class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int first = special[0] - bottom ;
        int last = top + 1 - special[special.length-1] - 1;
        int max = Math.max(first , last );
        for(int i =1 ;i<special.length ;i++){
            max = Math.max(max , special[i] - special[i-1] -1);
        }
        return max;
    }
}