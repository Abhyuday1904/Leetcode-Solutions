class Solution {
    public int minimumAddedCoins(int[] arr, int target) {
        Arrays.sort(arr);
        long sum  = 0;
        int count = 0;
        for(int i=0;i<arr.length;){
            
            if(sum + 1 == arr[i]){
                sum += sum+1;
                i++;
            }
            else if(sum+1<arr[i]){
                sum += sum+1;
                count++;
            }
            else if(sum + 1 >arr[i]){
                sum += arr[i];
                i++;
            }
            else if(sum + arr[i]>target) return count;
        } 
        while(sum<target){
            sum += sum+1;
            count++;
        }
        return count;
    }
}