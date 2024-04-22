class Solution {
    public int minimumCost(int[] arr) {
        int arrr[] = new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            arrr[i-1] = arr[i];
        }
        Arrays.sort(arrr); 
        return arr[0]+ arrr[0] + arrr[1];
    }
}